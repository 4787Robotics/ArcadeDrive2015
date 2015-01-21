/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Jaguar;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    /** This function is called once each time the robot enters autonomous mode.
     */
    RobotDrive drive;
    Joystick stick;
    
    Jaguar frontLeft = new Jaguar(1);
    Jaguar backLeft = new Jaguar(2);
    Jaguar frontRight = new Jaguar(3);
    Jaguar backRight = new Jaguar(4);
    
    public RobotTemplate()
    {
        //drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
        stick = new Joystick(1);
    }
    

    
    
    // Joystick constants
    int LEFT_JOYSTICK_USB = 1;
    int RIGHT_JOYSTICK_USB = 2;
    
    
    
    public void autonomous() {
        while(true){
            System.out.println("AUTONOMOUS MODE");
            Timer.delay(.1);
            //Without a delay you'll wind up running too quickly. A delay of .1 is good
            //DO NOT REMOVE
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        
            
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() //For testing PWMs
    {
        frontLeft.set(.05);
        Timer.delay(1);
        backLeft.set(.05);
        Timer.delay(1);
        frontRight.set(.05);
        Timer.delay(1);
        backRight.set(.05);
    }
}
