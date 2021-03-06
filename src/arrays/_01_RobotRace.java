package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing
		// the same direction

		for (int i = 0; i < rob.length; i++) {
			rob[i].setX(i * 200 + 50);
			rob[i].setY(500);
			rob[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean finished = false;
		while (!finished) {
			for (int k = 0; k < rob.length; k++) {

				Random randy = new Random();
				int bye = randy.nextInt(50);

				rob[k].move(bye);
				if(rob[k].getY()<=0) {
					JOptionPane.showMessageDialog(null, "Robot 4 won");
					rob[k].sparkle();
					finished = true;
					break;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}