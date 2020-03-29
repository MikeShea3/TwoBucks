/**
 * <h1>DisplayGoals</h1>
 * The DisplayGoals class prints to the screen the user's current saving
 * and spending goals and their current progress toward those goals.
 *
 * <p>
 *
 *
 * @author  Alex Gonzalez
 * @version 1.0
 * @since   03-18-2020
 */

package TwoBucks;

public class DisplayGoals {


    /**
     * Method performs the class' sole and primary function. It takes
     * a User class parameter to get the user's goals and spending
     *
     * @param user
     */
    public void displayGoals(User user){
        System.out.println("======== Current Goals ========");
        System.out.println("Weekly saving goal: " + user.getSaveAmount());      //print spend goal
        System.out.println("Weekly spending goal: " + user.getSpendAmount());   //print save goal

        System.out.println("======== Current Progress to Spending Goal ========");
        System.out.println("Total Weekly Expenses: " );                          //print week's total spending
        // (user.budget.getExpenses)
        System.out.println("Progress to Spending Goal: ");                       //print difference from goal
        // (user.getSpendAmount() - user.budget.getExpenses)

        System.out.println("======== Current Progress to Savings Goal ========");
        System.out.println("Total Weekly Savings: ");                           //print week's total spending
        System.out.println("Progress to Savings Goal: ");                       //print difference from goal (goal - saved)




    }
}