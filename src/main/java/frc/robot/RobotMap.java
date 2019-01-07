package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	// Victors
	public static final int DRIVETRAIN_LEFT_FRONT_VICTOR = 0;
	public static final int DRIVETRAIN_LEFT_BACK_VICTOR = 1;
	public static final int DRIVETRAIN_RIGHT_FRONT_VICTOR = 2;
	public static final int DRIVETRAIN_RIGHT_BACK_VICTOR = 3;

	//lift
	public static final int LIFT_VICTOR = 7;

	//intake
	public static final int LEFT_INTAKE = 4;
	public static final int RIGHT_INTAKE = 5;
	
	// Joysticks
	public static final int OI_DRIVER_CONTROLLER = 0;
	public static final int OI_OP_CONTROLLER = 1;
	public static final int JOYSTICK_MOVE_LEFT_AXIS = 1;
	public static final int JOYSTICK_MOVE_RIGHT_AXIS = 5;
}
