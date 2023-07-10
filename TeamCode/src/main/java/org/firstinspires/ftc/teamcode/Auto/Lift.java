package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Lift {

    public LinearOpMode opMode;

    // Difficulty: EASY
    // Phoenix: Create your motors

    public Lift(LinearOpMode opMode){
        this.opMode = opMode;

        // Difficulty: EASY
        // Phoenix: Hardware Map motors

        // Difficulty: EASY
        // Phoenix: Set your motors' zero power behavior
    }

    public void moveUp(int position){
        // Difficulty: MEDIUM
        // Phoenix
        // Assume there are three positions (low: 1, medium: 2, high: 3)
        // Assume position 1 is 100 encoders, position 2 is 200 encoders, position 3 is 300 encoders
        // Make sure to check if opmode is active (opMode.opModeIsActive())
        // Add telemetry to check encoder positions
    }

    public void moveDown(int position){
        // Difficulty: EASY
        // Phoenix
        // Bring lift position all the way down
        // Make sure to check if opmode is active (opMode.opModeIsActive())
        // Assume down position is 0 encoders
    }

    public void moveUpPID(){
        // Sophia
    }

    public void moveDownPID(){
        // Sophia
    }
}
