package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		{
		//use a switch statement to do something cool for each option
		Random r = new Random();
		int x = r.nextInt(7);
		switch(choice) {
		case "Sunday":
			System.out.println("Hope Monday never comes");
			break;
		case "Monday":
			System.out.println("Don't sleep in!!");
			break;
		case "Tuesday":
		System.out.println("Same thing, Different day");
		break;
		case "Wednesday":
			System.out.println("Half way there!!");
		break;
		case "Thursday":
		System.out.println("Tuesday rhymes with Thursday, but Thursday doesn't rhyme with Tuesday");
			break;
		case "Friday":
			System.out.println("Wow you made it to Friday! Good Job");
			break;
		case "Saturday":
			System.out.println("Sleep in!!");
			break;
		}
		}
	}
}
