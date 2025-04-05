package org.firstinspires.ftc.teamcode;


//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="PuckCollect test 1", group="Linear OpMode")

public class Main extends LinearOpMode
{

    //////////////////////////////////////////////////DECLARE MEMBERS
    private ElapsedTime runtime = new ElapsedTime();



    @Override
    public void runOpMode() {
        //  Status - is a caption test
        //  Initialized - message for the caption state
        telemetry.addData("Status", "Initialized");
        telemetry.update();



        InitMotors motors = new InitMotors(this.hardwareMap);


        /////////////////////////WAIT FOR THE START
        waitForStart();
        runtime.reset();
        /////////////////////////WAIT FOR THE START


        /////////////////////////RUN UNTIL THE END(driver presses STOP)
        while (opModeIsActive())
        {
            /////////////////////////////////////////GET INPUT
            double JS1X = -gamepad1.left_stick_x;
            double JS1Y =  gamepad1.left_stick_y;

            double JS2X = -gamepad1.right_stick_x;
            double JS2Y =  gamepad1.right_stick_y;

            double ExtPower = 0;
            if (gamepad1.dpad_up == true) ExtPower = 1;

            double RetrPower = 0;
            if (gamepad1.dpad_down == true) RetrPower = 1;

            double ServoGrab    = gamepad1.right_trigger;
            double ServoRelease = gamepad1.left_trigger;

            double ServoExtend  = (gamepad1.right_bumper ? 1 : 0);
            double ServoRetract = (gamepad1.left_bumper ? 1 : 0);

            double SJForward, SJBackward;

            double DcExtend = 0;
            double GSpos = 0.5, ESpos = 0.0;
            /////////////////////////////////////////GET INPUT

            /////////////////////////////////////////CROP INPUT
            JS1X = Range.clip(JS1X, -1.0, 1.0);
            JS1Y = Range.clip(JS1Y, -1.0, 1.0);

            JS2X = Range.clip(JS2X, -1.0, 1.0);
            JS2Y = Range.clip(JS2Y, -1.0, 1.0);

            DcExtend = Range.clip((ExtPower - RetrPower), -1.0, 1.0);

            GSpos = Range.clip(GSpos + ServoGrab - ServoRelease, 0, 1.0);
            ESpos = Range.clip(ESpos + ServoExtend - ServoRetract, 0, 1.0);

            SJForward  = Range.clip(JS1Y - JS1X, -1.0, 1.0);
            SJBackward = Range.clip(JS1Y + JS1X, -1.0, 1.0);
            /////////////////////////////////////////CROP INPUT





            ///////////////////////////////SHOW ELAPSED TIME
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();
            ///////////////////////////////SHOW ELAPSED TIME
        }
    }
}