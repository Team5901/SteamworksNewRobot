// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5901.Steamworks.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc5901.Steamworks.Robot;
import org.usfirst.frc5901.Steamworks.RobotMap;

/**
 *
 */
public class AutonomousLeftGear extends CommandGroup{

    public AutonomousLeftGear() {    	
    	
    	//Drive straight    	
    	addSequential(new AutonomousStraight(0.2,135), 3.4); //about 140
    	addSequential(new StopDrive(), 0.3);
    	
    	//Turn left
    	addSequential(new AutonomousTurn(-60), 2.0);
    	addSequential(new StopDrive(), 0.3);
    	
    	//Drive straight and wait 3 seconds
    	addSequential(new AutonomousStraight(0.3,78-39.5), 1.3); //74
    	addSequential(new StopDrive(), 3.0);
    	
    	//Drive backwards
    	addSequential(new AutonomousBackwards(0.2,100), 0.5);
        addSequential(new StopDrive(), 0.3);
    	
        //Turn right 6
        addSequential(new AutonomousTurn(60), 2.0);
    	addSequential(new StopDrive(), 0.3);
        
    	//Drive straight
    	addSequential(new AutonomousStraight(0.2,100), 2.0);
    	addSequential(new StopDrive(), 0.3);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.drivetrainGodKevinGyro.reset();
    	RobotMap.leftEncoder.reset();
	 }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stopDrive();	
    }
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
