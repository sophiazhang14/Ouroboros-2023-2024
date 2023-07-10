package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Teleop extends Telelib{
    @Override
    public void loop() {
        arcadeDrive();
        claw();
        lift();
    }
    @Override
    public void stop(){
        kill();
    }
}
