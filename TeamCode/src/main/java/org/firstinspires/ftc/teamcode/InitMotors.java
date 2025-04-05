package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class InitMotors
{
    //------------------  Initialize names  ----------------------------//

    //  Main motor to power the one wheel
    //  Главный мотор для езды на одном колесе
    DcMotor _driveMotor = null;


    //  Motor to rotate the single wheel
    //  For the differential steering
    //
    //  Мотор для поворота колеса вокруг своей оси
    //  Для дифференциального сверва
    DcMotor _rotateMotor = null;


    //  2 motors on 1 port
    //  For the brushes on the robot
    //
    //  2 мотора на 1 порту
    //  Для щёток на роботе
    DcMotor _brushMotors = null;


    //  Lego motor for sorting the pucks
    //  Леговский мотор для сортировки шайб
    DcMotor _sortMotor = null;


    //  Servo for releasing our color pucks on to the base
    //  Серва для выпуска правильных шайб (нашего цвета) на нашу базу
    Servo _releaseServo = null;

    //++++++++++++++++++  Initialize motors  ++++++++++++++++++++++++++++//


    InitMotors(HardwareMap _hardwareMap)
    {

        //----------------------  Get motors  ----------------------------------------//
        _driveMotor   = _hardwareMap.get(   DcMotor.class, "DriveMotor"    );
        _rotateMotor  = _hardwareMap.get(   DcMotor.class, "RotateMotor"   );
        _brushMotors  = _hardwareMap.get(   DcMotor.class, "BrushMotors"   );
        _sortMotor    = _hardwareMap.get(   DcMotor.class, "SortMotors"    );

        _releaseServo = _hardwareMap.get(    Servo.class, "ReleaseServo"   );
        //+++++++++++++++++++++++  Get motors  +++++++++++++++++++++++++++++++++++++++//


        //-------------------  Set motors direction  ---------------------------------//
        _driveMotor. setDirection(DcMotor.Direction.FORWARD);
        _rotateMotor.setDirection(DcMotor.Direction.FORWARD);

        _brushMotors.setDirection(DcMotor.Direction.FORWARD);
        _sortMotor.  setDirection(DcMotor.Direction.FORWARD);

        _releaseServo.setDirection(Servo.Direction.FORWARD);
        //+++++++++++++++++++  Set motors direction  +++++++++++++++++++++++++++++++++//

    }  //  Initialise motor ports


}
