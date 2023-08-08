package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class Telelib extends OpMode {

    // Difficulty: EASY
    // All: Create your motors and servos
    public DcMotor fl;
    public DcMotor fr;
    public DcMotor bl;
    public DcMotor br;
    public DcMotor motorLift;
    public Servo clawServo;

    @Override
    public void init(){
        // Difficulty: EASY
        // All: Hardware map your motors and servos
        fl = hardwareMap.get(DcMotor.class, "fl");
        fr = hardwareMap.get(DcMotor.class, "fr");
        bl = hardwareMap.get(DcMotor.class, "bl");
        br = hardwareMap.get(DcMotor.class, "br");
        motorLift = hardwareMap.get(DcMotor.class, "motorLift");
        clawServo = hardwareMap.get(Servo.class, "clawServo");

        // Difficulty: EASY
        // All: Set your motors' zero power behavior
        fl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        br.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Difficulty: EASY
        // All: Set your motors' directions
        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        fr.setDirection(DcMotorSimple.Direction.FORWARD);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction.FORWARD);
        motorLift.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void arcadeDrive(){
        // Difficulty: MEDIUM
        // Elin
        // Assume we are using a four motor mecanum drive train
        double vertical; // this is a variable
        double horizontal; // this is a variable
        double pivot; // this is a variable

        // sophia: you can delete your comments for this method. you only need to comment
        // on stuff that isn't easy to understand right away when you look at it.

        // The variables are sent to an important joysticks on gamepad1
        // sophia: make sure to review any comments you make to ensure they are accurate
        vertical = gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        // These are equations that help move the robot forward, backwards, left, and right
        fl.setPower(pivot + (vertical - horizontal));
        fr.setPower(pivot + (vertical + horizontal));
        bl.setPower(pivot + (vertical + horizontal));
        br.setPower(pivot + (vertical - horizontal));

        // sophia: your vertical -/+ horizontal part of your equations are correct, but the strafing part (pivot) is not.
        // try to use the picture krish sent in the sw channel during our meeting a while ago to fix this.

        // sophia: it's totally ok if you didn't know this before, but to make our robot easier
        // to control, we usually only move the robot when the joysticks pass a certain value.
        // ie. if(Math.abs(vertical) > .3 || Math.abs(horizontal) > Math.abs(pivot))
    }

    public void claw(){
        // Difficulty: MEDIUM
        // Phoenix
        // Assume we are using the same button to open and close the claw
        double currentPos = clawServo.getPosition(); // var used to track the state of the claw
        if (gamepad2.a && currentPos == 0.0) {
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

        if(Math.abs(gamepad2.right_stick_y) > .3) {
            motorLift.setPower(Math.signum(gamepad2.right_stick_y) * .25);
        } else {
            motorLift.setPower(0.0);
        }
    }

    public void kill(){
        // Difficulty: EASY
        // Elin
        // This method shuts off the power from all motors
        fl.setPower(0);
        fr.setPower(0);
        bl.setPower(0);
        br.setPower(0);

        // sophia: I pushed pheonix's code for the lift, so you should be able to see it now.
        // can you also shut off the power for the lift motor as well.
    }

}
