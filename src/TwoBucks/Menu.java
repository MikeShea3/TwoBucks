/**
 * <h1>Menu</h1>
 *
 * <p>The Menu class interacts with the user
 * in the form of interfaces which include
 * gathering inputs, exception handling and
 * switch cases to send the user to their
 * designated interface.</p>
 *
 * @author  Sawyer Kisha
 * @version 1.6
 * @since   1.0
 */

package TwoBucks;

import java.util.Scanner;

public class Menu
{

    private int option;

    /**
     *  Displays list of options for intro menu
     */
    public void showIntroOptions()
    {
        System.out.println("Welcome to TwoBucks ");
        System.out.println("   ");
        System.out.println("1. Create New Profile ");
        System.out.println("2. Load Profile ");
        System.out.println("3. Exit ");
    }

    /**
     * Displays list of options for main menu
     */
    public void showOptions()
    {
        System.out.println("1. Weekly Income ");
        System.out.println("2. Weekly Expense ");
        System.out.println("3. Financial Goals ");
        System.out.println("4. Debt Calculator ");
        System.out.println("5. Display Goals ");
        System.out.println("6. Goals vs Performance ");
        System.out.println("7. Set Budget ");
        System.out.println("8. Add to budget");
        System.out.println("9. Remove amount from budget");
        System.out.println("10. Update Profile ");
        System.out.println("11. Progress to Next Week");
        System.out.println("12. Display Results (initial, previous, current weekly budgets)");
        System.out.println("13. Display Report");
        System.out.println("14. Send Report to Email");
        System.out.println("15. Send Report to Text");
        System.out.println("16. Exit ");

    }

    /**
     * Displays list of options for budget menu
     */
    public void showBudgetOptions()
    {
        System.out.println("1. Display Current Budget ");
        System.out.println("2. Add to Budget ");
        System.out.println("3. Remove from Budget ");
        System.out.println("4. Return to main menu ");
    }

    /**
     * constructor for option
     * @return option
     */
    public int getOption()
    {
        return this.option;
    }

    /**
     * Uses the user input integer choice
     * which is then used for a switch case
     * in order to send the user to their
     * desired profile interface
     * @return choice
     */
    public int selectIntroOption()
    {
        //Getting user input
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option: ");
        try
        {
            //Make sure integer
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. ");
                scanner.next();
            }
            choice = scanner.nextInt();

            //Make sure accepted integer
            while (choice <= 0 || choice > 3) {
                System.out.print("Invalid input. ");

                // Make sure integer
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. ");
                    scanner.next();
                }

                choice = scanner.nextInt();
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter a numerical value ");
        }

        switch(choice)
        {
            case 1:
                //Create New Profile
                this.option = 1;
                System.out.println("Create User: ");
                break;
            case 2:
                //Load Profile
                this.option = 2;
                System.out.println("Load Profile: ");
                break;
            case 3:
                //Exiting the application
                this.option = 3;
                System.out.println("TwoBucks application closing...");
                break;
            default:
                //If invalid input
                System.out.println("Invalid option");
                selectIntroOption();
                break;
        }
        return choice;
    }

    /**
     * Uses the user input integer choice
     * which is then used for a switch case
     * in order to send the user to their
     * desired interface
     * @return choice
     */
    public int selectOption()
    {

        //Getting user input
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option: ");
        try
        {
            //Make sure integer
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. ");
                scanner.next();
            }
            choice = scanner.nextInt();

            //Make sure accepted integer
            while (choice <= 0 || choice > 16) {
                System.out.print("Invalid input. ");

                // Make sure integer
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. ");
                    scanner.next();
                }

                choice = scanner.nextInt();
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter a numerical value ");
        }

        //Each option leads to different feature
        switch(choice)
        {
            case 1:
                //Weekly Income
                this.option = 1;
                System.out.println("Weekly Income: ");
                break;
            case 2:
                //Weekly Expense
                this.option = 2;
                System.out.println("Weekly Expense: ");
                break;
            case 3:
                //Financial Goals
                this.option = 3;
                System.out.println("Financial Goals: ");
                break;
            case 4:
                //Debt Calculator
                this.option = 4;
                System.out.println("Debt Calculator: ");
                break;
            case 5:
                //Display Goals
                this.option = 5;
                System.out.println("Display Goals: ");
                break;
            case 6:
                //Goals vs Performance
                this.option = 6;
                System.out.println("Goals vs Performance: ");
                break;
            case 7:
                //Set Budget
                this.option = 7;
                System.out.println("Budget: ");
                break;
            case 8:
                // Add item to budget
                System.out.println("Adding item to budget...");
                this.option = 8;
                break;
            case 9:
                // Remove item from budget
                this.option = 9;
                System.out.println("Removing item from budget...");
                break;
            case 10:
                // Update profile
                this.option = 10;
                break;
            case 11:
                //Progress to Next Week
                this.option = 11;
                System.out.println("To Next Week: ");
                break;
            case 12:
                // Display Results
                this.option = 12;
                System.out.println("Displaying results...");
                break;
            case 13:
                // Display Report
                this.option = 13;
                System.out.println("Display Report: ");
                break;
            case 14:
                // Send Report to Email
                this.option = 14;
                System.out.println("Send Report to Email: ");
                break;
            case 15:
                // Send Report to Text
                this.option = 15;
                System.out.println("Send Report to Text: ");
                break;
            case 16:
                //Exiting the application
                this.option = 16;
                System.out.println("TwoBucks application closing...");
                break;
            default:
                //If invalid input
                System.out.println("Invalid option");
                break;
        }
        return choice;
    }
}