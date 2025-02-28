/* package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.Command;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShooterSubsystem {
    private final VictorSPX

    shooterMotor = new VictorSPX(18);

    public void shootBall(double speed){
        shooterMotor.set(ControlMode.PercentOutput, speed);
        System.out.println("Shooting the ball");
    }
    
    public void stopShooter() {
        shooterMotor.set(ControlMode.PercentOutput, 0); // Stop the shooter motor
    }
    public Command ShootBall() {
        return new Command() {
            @Override
            public void initialize() {
                shootBall(0.8);
                System.out.println("Shooting the ball");
            }

            @Override
            public boolean isFinished() {
                return true;
            }
        };
    }
}
 */