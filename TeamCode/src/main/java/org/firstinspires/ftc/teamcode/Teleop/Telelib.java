package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public abstract class Telelib extends OpMode {

    // Difficulty: EASY
    // All: Create your motors and servos

    public void init(){
        // Difficulty: EASY
        // All: Hardware map your motors and servos


        // Difficulty: EASY
        // All: Set your motors' zero power behavior


        // Difficulty: EASY
        // All: Set your motors' directions

    }
    public void arcadeDrive(){
        // Difficulty: MEDIUM
        // Elin
        // Assume we are using a four motor mecanum drive train
    }

    public void claw(){
        // Difficulty: MEDIUM
        // Phoenix
        // Assume we are using the same button to open and close the claw
    }

    public void lift(){
        // Difficulty: EASY
        // Phoenix
        // Assume we are using one motor to power the lift
        // Assume we are using the joysticks to control the lift
    }

    public void kill(){
        // Difficulty: EASY
        // Elin
        // This method shuts off the power from all motors
    }

}
