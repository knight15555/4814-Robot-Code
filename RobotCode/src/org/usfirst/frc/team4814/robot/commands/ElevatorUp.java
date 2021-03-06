package org.usfirst.frc.team4814.robot.commands;

import org.usfirst.frc.team4814.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorUp extends Command {

    public ElevatorUp() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//if (Robot.elevator.getCurrentElevatorLevel() == 2)
    		//Robot.elevator.lift(0);
    	//else
    		Robot.elevator.lift(0.4);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       // return !Robot.elevator.getLimitSwitch(2);
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.lift(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
