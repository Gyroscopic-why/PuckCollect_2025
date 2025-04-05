package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class InitMotors
{
    //------------------  Initialize names  ----------------------------//

    //  Main motor to power the one wheel
    //  Главный мотор для езды на одном колесе
    DcMotor driveMotor;


    //  Motor to rotate the single wheel
    //  For the differential steering
    //
    //  Мотор для поворота колеса вокруг своей оси
    //  Для дифференциального сверва
    DcMotor rotateMotor;


    //  2 motors on 1 port
    //  For the brushes on the robot
    //
    //  2 мотора на 1 порту
    //  Для щёток на роботе
    DcMotor brushMotors;


    //  Lego motor for sorting the pucks
    //  Леговский мотор для сортировки шайб
    DcMotor separatorMotor;


    //  Servo for releasing our color pucks on to the base
    //  Серва для выпуска правильных шайб (нашего цвета) на нашу базу
    Servo releaseServo;

    //++++++++++++++++++  Initialize motors  ++++++++++++++++++++++++++++//


    InitMotors(HardwareMap _hardwareMap)
    {

        //----------------------  Get motors  ---------------------------------------//
        driveMotor     = _hardwareMap.get(DcMotor.class, "DriveMotor"     );
        rotateMotor    = _hardwareMap.get(DcMotor.class, "RotateMotor"    );
        brushMotors    = _hardwareMap.get(DcMotor.class, "BrushMotors"    );
        separatorMotor = _hardwareMap.get(DcMotor.class, "separatorMotors");

        releaseServo   = _hardwareMap.get(  Servo.class, "ReleaseServo"   );
        //+++++++++++++++++++++++  Get motors  ++++++++++++++++++++++++++++++++++++++//


        //-------------------  Set motors direction  --------------------------------//
        driveMotor. setDirection(DcMotor.Direction.FORWARD);
        rotateMotor.setDirection(DcMotor.Direction.FORWARD);

        brushMotors.setDirection(DcMotor.Direction.FORWARD);
        separatorMotor.setDirection(DcMotor.Direction.FORWARD);

        releaseServo.setDirection(Servo.Direction.FORWARD);
        //+++++++++++++++++++  Set motors direction  +++++++++++++++++++++++++++++++//

    }  //  Constructor - Initialise motor ports

    
    public void EnableMotor(int _motorNumber, byte _power)
    {
        switch (_motorNumber)
        {
            case 1:
                driveMotor.setPower(_power);
                break;
            case 2:
                rotateMotor.setPower(_power);
                break;
            case 3:
                brushMotors.setPower(_power);
                break;
            case 4:
                separatorMotor.setPower(_power);
                break;
        }
    }  //  Enable motor
    
    public void DisableMotor(byte _motorNumber)
    {
        switch (_motorNumber)
        {
            case 1:
                driveMotor.setPower(0);
                break;
            case 2:
                rotateMotor.setPower(0);
            case 3:
                brushMotors.setPower(0);
                break;
            case 4:
                separatorMotor.setPower(0);
                break;
        }
    }  //  Disable motor

    public void SetServoPosition(double _servoPosition)
    {
        releaseServo.setPosition(_servoPosition);
    }  //  Change servo position

    public double GetServoPosition()
    {
        // Return current servo position
        return releaseServo.getPosition();
    }  //  Get servo position

    public double GetDcMotorPosition(byte _motorNumber)
    {
        switch (_motorNumber)
        {
            case 1:
                return driveMotor.getCurrentPosition();
            case 2:
                return rotateMotor.getCurrentPosition();
            case 3:
                return brushMotors.getCurrentPosition();
            case 4:
                return separatorMotor.getCurrentPosition();
            default: return 0;
        }
    }  //  Get Dc motor position
}
