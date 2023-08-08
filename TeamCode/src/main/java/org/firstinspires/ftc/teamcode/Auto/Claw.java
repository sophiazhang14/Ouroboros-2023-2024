package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    public LinearOpMode opMode;

    // Difficulty: EASY
    // Elin: Create your servo
    public Servo claw;

    public Claw(LinearOpMode opMode){
        this.opMode = opMode;

        // Difficulty: EASY
        // ELin: Hardware Map servo
        claw = opMode.hardwareMap.servo.get("claw");

    }

    public void openClaw(){
        // Difficulty: EASY
        // Elin
        claw.setPosition(0);
    }

    public void closeClaw(){
        // Difficulty: EASY
        // ELin
        claw.setPosition(1);
    }
}
