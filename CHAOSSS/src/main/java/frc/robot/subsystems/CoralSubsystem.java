/* package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.Command;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class CoralSubsystem {
    private final VictorSPX

    coralMotor = new VictorSPX(17);

    public void coralDrop(double speed){
        coralMotor.set(ControlMode.PercentOutput, speed);
        System.out.println("Dropping the coral");
    }
    
    public void stopCoral() {
        coralMotor.set(ControlMode.PercentOutput, 0); // Stop the coral motor
    }

    public Command CoralDrop(){
        return new Command(){
            @Override
            public void initialize(){
                coralDrop(0.8);
                System.out.println("Dropping the coral");
            }
            @Override
            public boolean isFinished(){
                return true;
            }
        };
    }
}
 */