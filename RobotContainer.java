import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
//FIND THE IMPORT for the CommandXboxController in the API Documentation
import edu.wpi.first.wpilibj2.command.button.CommandXboxController
public class RobotContainer {
  private final CommandXboxController joystick = new CommandXboxController(0);
  private final CommandXboxController joystick2 = new CommandXboxController(1)
//CREATE ANOTHER CommandXboxController with a different name and different port Number
  public static TalonFX shooterTop = new TalonFX(0);
  public static TalonFX shooterBottom = new TalonFX(1);
  //CREATE ANOTHER TalonFX motor and call it "shooterBottom" and different port Number


  private void configureBindings() {
    //private void configureBindings() is a method often used to set up input bindings between the robot's controls (like joystick buttons) and commands that should be executed in response to those inputs

    joystick
			.rightTrigger()
			.onTrue(
				//ANSWER THIS QUESTION: Why is it called "ButtonCommands.resetShooter(etc.)"? Why can't it just be called "resetShooter(etc.)"?
				ButtonCommands.resetShooter(shooterTop, shooterBottom))
			.whileTrue(
				
				ButtonCommands.shootNote(shooterTop, shooterBottom, ShuffleBoard.TopShooterOutSpeed, ShuffleBoard.BottomShooterOutSpeed)
			)
			.onFalse(
				ButtonCommands.resetShooter(shooterTop, shooterBottom));

    joystick2
	  // CREATE A NEW FUNCTION FOR THE OTHER JOYSTICK YOU CREATED
	  //Instead of ".rightTrigger()" do ".leftTrigger()"
	  .leftTrigger()
	  .on True(
	    	ButtonCommands.resetShooter(shooterTop, shooterBottom))
		  //call on function to reset the Shooter)
	  .whileTrue(
	    		ButtonCommands.shootNote(shooterTop, shooterBottom, ShuffleBoard.TopShooterOutSpeed, ShuffleBoard.BottomShooterOutSpeed)
		  //call on function to intakeNote)
	  .onFalse(
		  ButtonCommands.resetShooter(shooterTop, shooterBottom));
		  //call on function to reset the Shooter)
		  
    
  }

}
