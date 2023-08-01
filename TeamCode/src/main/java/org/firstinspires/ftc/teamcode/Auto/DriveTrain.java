package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class DriveTrain {

    public LinearOpMode opMode;

    // Difficulty: EASY
    // Krish: Create your motors
    public DcMotor br;
    public DcMotor bl;
    public DcMotor fr;
    public DcMotor fl;


    public DriveTrain(LinearOpMode opMode){
        this.opMode = opMode;

        // Difficulty: EASY
        // Krish: Hardware map the motors
        // Assume we are using a four motor drivetrain
        br = opMode.hardwareMap.dcMotor.get("br");
        bl = opMode.hardwareMap.dcMotor.get("bl");
        fr = opMode.hardwareMap.dcMotor.get("fr");
        fl = opMode.hardwareMap.dcMotor.get("fl");

        // Difficulty: EASY
        // Krish: Set motors' zero power behavior
        br.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // Difficulty: EASY
        // Krish: Set motors' direction
        br.setDirection(DcMotor.Direction.FORWARD);
        bl.setDirection(DcMotor.Direction.REVERSE);
        fr.setDirection(DcMotor.Direction.FORWARD);
        fl.setDirection(DcMotor.Direction.REVERSE);

    }

    public void resetEncoders(){
        // Difficulty: EASY
        // Krish
        br.setMode(DcMotor.RunMode.RESET_ENCODERS);
        br.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        fr.setMode(DcMotor.RunMode.RESET_ENCODERS);
        fr.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        bl.setMode(DcMotor.RunMode.RESET_ENCODERS);
        bl.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        fl.setMode(DcMotor.RunMode.RESET_ENCODERS);
        fl.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void encoderMove(boolean isForward, double power, double distance, double runtime){
        // Difficulty: MEDIUM
        // Krish
        ElapsedTime time = new ElapsedTime();
        resetEncoders();
        time.reset();
        double movement = 0;

        while (time.seconds() < runtime && movement < distance && opMode.opModeIsActive()){
            movement = (bl.getCurrentPosition() + br.getCurrentPosition() + fl.getCurrentPosition() + fr.getCurrentPosition())/4;
            if (isForward) {
                br.setPower(power);
                bl.setPower(power);
                fr.setPower(power);
                fl.setPower(power);
            }
            else{
                br.setPower(-power);
                bl.setPower(-power);
                fr.setPower(-power);
                fl.setPower(-power);
            }
        }
        kill();
        // Add telemetry
        telemetry.addData("bl:" + bl.getCurrentPosition())
        telemetry.addData("fl:" + fl.getCurrentPosition())
        telemetry.addData("br:" + br.getCurrentPosition())
        telemetry.addData("fr:" + fr.getCurrentPosition())
    }

    public void encoderTurn(boolean isRight, double power, double distance, double runtime){
        // Difficulty: MEDIUM
        // Krish
        ElapsedTime time = new ElapsedTime();
        resetEncoders();
        time.reset();
        double movement = 0;

        while (time.seconds() < runtime && movement < distance && opMode.opModeIsActive()){
            movement = (bl.getCurrentPosition() + br.getCurrentPosition() + fl.getCurrentPosition() + fr.getCurrentPosition())/4;
            if (isForward) {
                br.setPower(0);
                bl.setPower(0);
                fr.setPower(power);
                fl.setPower(power);
            }
            else{
                br.setPower(power);
                bl.setPower(power);
                fr.setPower(0);
                fl.setPower(0);
            }
        }
        kill();
        // Add telemetry
        telemetry.addData("bl:" + bl.getCurrentPosition())
        telemetry.addData("fl:" + fl.getCurrentPosition())
        telemetry.addData("br:" + br.getCurrentPosition())
        telemetry.addData("fr:" + fr.getCurrentPosition())
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
        fr.setPower(0);
        br.setPower(0);
        bl.setPower(0);
        fl.setPower(0);
    }

}
