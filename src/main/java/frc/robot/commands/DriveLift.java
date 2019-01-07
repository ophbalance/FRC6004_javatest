package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveLift extends Command {

    public DriveLift() {
    		requires(Robot.liftdrive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double liftSpeed = deadband(Robot.oi.opController.getRawAxis(RobotMap.JOYSTICK_MOVE_LEFT_AXIS),.1); 
    		Robot.liftdrive.LiftMove(liftSpeed);
    }
    
    // curve inputs
    public double deadband(double JoystickValue, double DeadbandCutOff) {
    	double deadbandreturn = 0;
    	if (JoystickValue<DeadbandCutOff&&JoystickValue>(DeadbandCutOff*(-1))) {
    		deadbandreturn = 0 ;
    	}
    	else {
    		deadbandreturn = (JoystickValue-(Math.abs(JoystickValue)/JoystickValue*DeadbandCutOff))/(1-DeadbandCutOff);
    	}
    	return deadbandreturn;
    }
    
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    		Robot.liftdrive.LiftMove(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		end();
    }
}
