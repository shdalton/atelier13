/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class Labyrinth extends SequentialCommandGroup {

  public Labyrinth() {
    // suggestion, attendre 0.5 secondes entre les commandes...
    addCommands(
        new Forward().andThen(new WaitCommand(0.5)),
        new 
        new 
        new
        new 
        new 
        new 
        );
  }
}