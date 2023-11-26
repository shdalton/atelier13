/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class Forward extends CommandBase {

  // on utilise des distances en pouces... oh well
  double distance;

  public Forward(double inches) {
    // on indique qu'on a besoin du chassis

    distance = 
  }

  @Override
  public void initialize() {
    // à l'initialisation de la commande, on remet le chassis à 0
  }

  @Override
  public void execute() {
    // on va tout droit à la vitesse choisie... suggestion 15%
    RobotContainer.chassis.
  }

  @Override
  public void end(boolean interrupted) {
    // quand la commande a terminée, on arrête le chassis
  }

  @Override
  public boolean isFinished() {
    // quand une des roues à parcourue la distance souhaitée, c'est fini
    return RobotContainer.chassis.
  }
}
