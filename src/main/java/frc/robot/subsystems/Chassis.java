package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
  PWMVictorSPX leftMotor;
  PWMVictorSPX rightMotor;
  DifferentialDrive diffDrive;
  Encoder leftEncoder;
  Encoder rightEncoder;

  public Chassis() {
    // les moteurs du Romi sont des Victor SPX...
    leftMotor = 
    rightMotor = 

    // il faut inverser un des deux  moteurs... pour que ça roule droit!

    // maintenant on construit un drive qui regroupe les deux  moteurs
    diffDrive = 

    // on affiche cette variable dans le smart dashboard
    

    // désactive la sécurité (système de timout non nécessaire pour cet exemple)
    diffDrive.

    // création de l'encodeur de gauche, direction reversée
    leftEncoder = 
    // sans oublier la distance par impulsion...
    leftEncoder.

    // on affiche cette variable dans le smart dashboard

    // création de l'encodeur de droite lui aussi avec la direction reversée
    rightEncoder = 
    // sans oublier la distance par impulsion...
    rightEncoder.

    // on affiche cette variable dans le smart dashboard
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }

  public double getLeftDistance() {
    return leftEncoder.getDistance();
  }

  public double getRightDistance() {
    return rightEncoder.getDistance();
  }

  public void drive(double speed, double direction) {
    // on utilise un drive de type arcade...
    diffDrive.
  }

  public void drive(double speed, double direction, boolean squaredInputs) {
    // on utilise un drive de type arcade...
    diffDrive.
  }

  public void reset() {
    // remise à 0 des deux encodeurs
  }

  public void stop() {
    // on met le drive à 0 vitesse et 0 direction...
  }
}
