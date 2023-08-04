package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class Telelib extends OpMode {

    // Difficulty: EASY
    // All: Create your motors and servos
    public DcMotor motorLift;
    public Servo clawServo;

    public void init(){
        // Difficulty: EASY
        // All: Hardware map your motors and servos
        motorLift = hardwareMap.get(DcMotor.class, "lift_motor");
        clawServo = hardwareMap.get(Servo.class, "claw_servo");

        // Difficulty: EASY
        // All: Set your motors' zero power behavior
        motorLift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Difficulty: EASY
        // All: Set your motors' directions
        motorLift.setDirection(DcMotorSimple.Direction.FORWARD);
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
        double currentPos = clawServo.getPosition(); // var used to track the state of the claw
        if (gamepad1.a && currentPos == 0.0) {
            clawServo.setPosition(1.0); // fully open
        } else {
            clawServo.setPosition(0.0); // fully closed
        }
    }

    public void lift(){
        // Difficulty: EASY
        // Phoenix
        // Assume we are using one motor to power the lift
        // Assume we are using the joysticks to control the lift
        double liftPower = gamepad1.right_stick_y; // uses the right joystick to control the lift
        motorLift.setPower(liftPower);
    }

    public void kill(){
        // Difficulty: EASY
        // Elin
        // This method shuts off the power from all motors
    }

}
