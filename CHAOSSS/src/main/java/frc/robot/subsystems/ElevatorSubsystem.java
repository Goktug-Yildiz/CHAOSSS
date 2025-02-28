/* package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Timer;

public class ElevatorSubsystem {
    
    private final TalonSRX elevatorMotor = new TalonSRX(19);
    private final Timer timer = new Timer();

    private final double LEVEL_MOVE_TIME = 2.0;

    public void moveElevator(double speed){
        elevatorMotor.set(ControlMode.PercentOutput, speed);
        System.out.println("Elevator moving. ");
    }

    public void levelUp(){
        timer.reset();
        timer.start();
        elevatorMotor.set(ControlMode.PercentOutput, 0.5);

        while (timer.get() < LEVEL_MOVE_TIME){
            // Wait for the elevator to reach the desired level
        }
        elevatorMotor.set(ControlMode.PercentOutput, 0); // Stop
        System.out.println("Elevator leveled up.");
    }
    
    public void levelDown(){
        timer.reset();
        timer.start();
        elevatorMotor.set(ControlMode.PercentOutput, -0.5);

        while (timer.get() < LEVEL_MOVE_TIME){
            // Wait for the elevator to reach the desired level
        }
        elevatorMotor.set(ControlMode.PercentOutput, 0); // Stop
        System.out.println("Elevator leveled down.");
    }
}
 */