package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class DriveTrain {

    public LinearOpMode opMode;

    // Difficulty: EASY
    // Krish: Create your motors

    public DriveTrain(LinearOpMode opMode){
        this.opMode = opMode;

        // Difficulty: EASY
        // Krish: Hardware map the motors
        // Assume we are using a four motor drivetrain


        // Difficulty: EASY
        // Krish: Set motors' zero power behavior


        // Difficulty: EASY
        // Krish: Set motors' direction

    }

    public void resetEncoders(){
        // Difficulty: EASY
        // Krish
    }

    public void encoderMove(/*add parameters*/){
        // Difficulty: MEDIUM
        // Krish
        // Add telemetry
    }

    public void encoderTurn(/*add parameters*/){
        // Difficulty: MEDIUM
        // Krish
        // Add telemetry
    }

    public void turnPID(/*add parameters*/){
        // Difficulty: HARD
        // Optional: Krish
        // Not required but feel free to add additional components like
        // feedforward, integral limit, or a low pass filter if you want to
        // Add telemetry
    }

    public void kill(){
        // Difficulty: EASY
        // Krish
    }

}
