package org.firstinspires.ftc.teamcode;

//------------------  Initialize names  ----------------------------//

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;



public class Devices
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
}
