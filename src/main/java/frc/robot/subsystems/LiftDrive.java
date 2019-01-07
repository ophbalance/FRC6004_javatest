package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.DriveLift;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftDrive extends Subsystem {
	
	// Motor Controllers
	Victor liftDriveMotor = null;
	
	//RobotDrive robotDrive = null;
	
	public LiftDrive() {
		// Victors
		liftDriveMotor = new Victor(RobotMap.LIFT_VICTOR);

	}
	
	public void LiftMove(double liftSpeed) {
		//robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
		liftDriveMotor.set(liftSpeed);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveLift());
    }
    
   
}