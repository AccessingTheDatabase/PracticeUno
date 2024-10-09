package frc.robot.commands;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Robot;

public class ButtonCommands {

  public static Command shootNote(TalonFX shooterTop, TalonFX shooterBottom, GenericEntry MaxShooterSpeedTop,
      GenericEntry MaxShooterSpeedBottom) {
        return Commands.sequence(
        Commands.run(
            () -> {
              shooterTop.set(-1.0);
            }));
    }

    public static Command resetShooter(TalonFX shooterTop, TalonFX shooterBottom) {
        return Commands.sequence(
        Commands.run(
        () -> {
          shooterTop.set(0.0);
          shooterBottom.set(0.0);
        }));
    }
    
    //CREATE A NEW "public static Command" called "intakeNote"
    //The only parameter you need is "shooterTop"
    //Set the shooterTop to intake at 100% speed

  public static Command intakeNote(TalonFX shooterTop)
   
  }

