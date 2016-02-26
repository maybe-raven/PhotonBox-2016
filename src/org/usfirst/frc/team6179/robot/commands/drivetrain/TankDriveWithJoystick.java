package org.usfirst.frc.team6179.robot.commands.driveTrain;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6179.robot.LogitechGamepad;
import org.usfirst.frc.team6179.robot.Robot;

public class TankDriveWithJoystick extends Command {

    public TankDriveWithJoystick() {
    	requires(Robot.instance.driveTrain);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        Robot.instance.driveTrain.tankDrive(Robot.instance.oi.getLeftY(), Robot.instance.oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {

    }

    protected void interrupted() {
    }

    private void endCommand() {
        Robot.instance.driveTrain.stop();
    }
} 
