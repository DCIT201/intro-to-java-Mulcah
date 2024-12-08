import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        // Create a Scanner object to handle user input
        Scanner input = new Scanner(System.in);

        // Infinite loop to repeatedly show the menu until the user exits
        while (true) {

            // Display the conversion options menu
            System.out.println("    CHOOSE YOUR CONVERSION OPTION (1 / 2)    ");
            System.out.println("---------------------------------------------");
            System.out.println("|       1. Celsius to Fahrenheit            |");
            System.out.println("|       2. Fahrenheit to Celsius            |");
            System.out.println("|       0. Exit                             |");
            System.out.println("---------------------------------------------");

            // Check if the user entered an integer
            if (input.hasNextInt()) {

                // Read the user's choice
                int option = input.nextInt();

                // Exit condition
                if (option == 0) {
                    System.out.println("Exiting the program");
                    break;
                }

                // Handle the chosen option
                switch (option) {

                    // Celsius to Fahrenheit conversion
                    case 1:
                        System.out.println("        State your Celsius value        ");
                        System.out.println("---------------------------------------------");

                        // Check if the user entered a valid number
                        if (input.hasNextFloat()) {

                            // Read the Celsius value
                            float C = input.nextFloat();

                            // Check if temperature exceeds upper range
                            if (C > 56.7) {
                                System.out.println("The temperature is too hot (above the range)!");
                            } else if (C < -273.15) { // Check if temperature is below lower range
                                System.out.println("The temperature is too cold (below the range)!");
                            } else {
                                // Perform the conversion and display the result
                                float F = (C * 9 / 5) + 32f;
                                System.out.printf("Your Fahrenheit value is %.2f°F.\n", F);
                            }
                        } else {
                            // Handle invalid input for temperature
                            System.out.println("Invalid input! Please enter a valid number.");

                            // Clear the invalid input
                            input.next();
                        }
                        break;

                    // Fahrenheit to Celsius conversion
                    case 2:
                        System.out.println("        State your Fahrenheit value        ");
                        System.out.println("---------------------------------------------");

                        // Check if the user entered a valid number
                        if (input.hasNextFloat()) {

                            // Read the Fahrenheit value
                            float F = input.nextFloat();

                            // Check if temperature exceeds upper range
                            if (F > 136) {
                                System.out.println("The temperature is too hot (above the range)!");
                            } else if (F < -459.67) { // Check if temperature is below lower range
                                System.out.println("The temperature is too cold (below the range)!");
                            } else {
                                // Performing the conversion and display the result
                                float C = (F - 32) * 5 / 9f;
                                System.out.printf("Your Celsius value is %.2f°C.\n", C);
                            }

                        } else {
                            // Handle invalid input for temperature
                            System.out.println("Invalid input! Please enter a valid number.");

                            // Clear the invalid input
                            input.next();
                        }
                        break;

                    default:
                        // Handle invalid menu option
                        System.out.println("Invalid option! Please choose 1, 2, or 0 to exit.");
                        break;
                }
            } else {
                // Handle invalid input for menu selection
                System.out.println("Invalid input! Please enter a number.");

                // Clear the invalid input
                input.next();
            }
        }

        // Close the Scanner to release resources
        input.close();
    }
}
