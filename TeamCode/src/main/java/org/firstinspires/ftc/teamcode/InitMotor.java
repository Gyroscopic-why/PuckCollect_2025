package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class InitMotor
{
    DcMotor motor;


    InitMotor(HardwareMap _hardwareMap, String _deviceName, boolean _direction)
    {
        //----------------------  Get motors  ----------------------------------//
        motor = _hardwareMap.get(DcMotor.class, _deviceName);


        //-------------------  Set motors direction  ---------------------------//
        if(_direction) motor.setDirection(DcMotorSimple.Direction.FORWARD);
        else           motor.setDirection(DcMotorSimple.Direction.REVERSE);

    }  //  Constructor - Initialise motor ports

    
    public void SetPower(byte _power)
    {
        //  Set power to the motor
        motor.setPower(_power);
    }  //  Enable motor
    
    public void DisableMotor(byte _power)
    {
        //  Set motor power to 0
        motor.setPower(_power);
    }  //  Disable motor

    public double GetDcMotorPosition(byte _motorNumber)
    {
        //  Get the current motor position
        //  Return the position
        return motor.getCurrentPosition();

    }  //  Get Dc motor position
}
