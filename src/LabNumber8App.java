
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabNumber8App {

	public static void main(String[] args) {
		// Write a program that will recognize invalid inputs when the user request
        // information about students in a class.
        // Provide information about students in a class
        // Prompt the user to ask about a particular student
        // Give proper responses according to user-submitted information
        // Ask if user would like to learn about another student
        Scanner scnr = new Scanner(System.in);
        String knowledge;
        String userContinue = "yes";
        int[] studentNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String[] names = {"Adan", "Bryan", "Julio", "Gabriel", "Ludicris", "Mariah", "Lilo", "Stich", "Joey", "Kim",
                "George", "Constanza", "Raymond", "Angela", "Julia", "Rufus", "Mary", "Cornelius", "Roger", "Cristos"};
        String[] hometown = {"Los Angeles", "Detroit", "Mexico", "Chicago", "Detroit", "Texas", "Florida", "Tenesse",
                "Wisconsin", "South Carolina", "Colorado", "Arizona", "Los Angeles", "Idaho", "Washington", "Kansas",
                "Iowa", "Indiana", "Atlanta", "Nevada"};
        String[] food = {"Tacos", "Pizza", "Enchiladas", "Hot Dog", "Coneys", "BBQ", "SeaFood", "Chicken", "Cheese",
                "Pancakes", "Pitas", "Burritos", "Tacos", "Potato", "Seafood", "BBQ", "Hot Dogs", "Coneys", "Steak","Cotton candy"};


        do {

            System.out.println("Welcome to our java class. Which student would you like to learn more about?");

            System.out.println();

            for (int i = 0; i < names.length; i++)
                System.out.println(studentNum[i] + " " + names[i]);


            int userEntry = getInt1("Please enter a numner between 1-20", scnr);
            System.out.println("You have selected " + names[userEntry - 1]);

            System.out.println("Do you wish to continue?");
            userContinue = scnr.next();

            if(userContinue.equalsIgnoreCase("yes")) {
                System.out.println("Would you like to know about " + names[userEntry - 1] + "'s food or hometown?");
                String userChoice = scnr.next().toLowerCase();

                if(userChoice.equalsIgnoreCase("food") || userChoice.equalsIgnoreCase("hometown")) {

                    switch(userChoice){
                        case "food":
                            System.out.println("You have selected " + userChoice + " " + names[userEntry - 1] + " likes " + food[userEntry - 1]);
                            break;
                        case "hometown":
                            System.out.println("You have selected " + userChoice + " " + names[userEntry - 1] + " is from " + hometown[userEntry - 1]);
                            break;
                    }
                }
            }
            System.out.println("Would you like to chose another name");
            userContinue = scnr.next();


        } while (userContinue.equalsIgnoreCase("yes"));

        System.out.println();

        System.out.println("Goodbye");

        scnr.close();

    }

    private static boolean userContinue(boolean b) {
        // TODO Auto-generated method stub
        return false;
    }

       public static int getInt1(String prompt, Scanner scnr) {
        boolean isValid = false;
        int num = 0;

        do {
			
        	num = scnr.nextInt();
        	
        	if (num < 1) {
				isValid = false;
				System.out.println("The number must be between 1-20");
			} else if (num > 20) {
				isValid = false;
				System.out.println("The number must be between 1-20");
			} else {
				isValid = true;
			}
		} while (!isValid);
        
		return num;
    }
    
}