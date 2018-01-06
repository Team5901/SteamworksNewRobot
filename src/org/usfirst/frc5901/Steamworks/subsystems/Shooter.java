// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5901.Steamworks.subsystems;

import org.usfirst.frc5901.Steamworks.RobotMap;
import org.usfirst.frc5901.Steamworks.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {

    public void shooterOn(){
    	RobotMap.shooterLeftMotor.set(0.8);
    	RobotMap.shooterRightMotor.set(-0.8);
    	RobotMap.feederMotor.set(-1.0);
    }
    
    public void shooterOff(){
    	RobotMap.shooterLeftMotor.set(0.0);
    	RobotMap.shooterRightMotor.set(0.0);
    	RobotMap.feederMotor.set(0.0);
    }  
    
    public void ReverseLoader(){
    	RobotMap.feederMotor.set(1.0);
    }    
    
    public void StopLoader(){
    	RobotMap.feederMotor.set(0.0);
    }    

    public void initDefaultCommand() {
    
        setDefaultCommand(new StopShoot());

    }
}

