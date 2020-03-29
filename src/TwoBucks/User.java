/**
 * <h1>User</h1>
 * The User class is used throughout the program primarily uses
 * a pipe and filter architectural style. The values in the user
 * class will be updated based on user input and how it flows through
 * other processes.
 *
 * <p>
 *
 *
 * @author  Alex Gonzalez
 * @version 1.0
 * @since   03-04-2020
 */

package TwoBucks;


public class User {
    private String firstName;
    private String lastName;
    //private String password;      //may use in future sprint
    private String email;
    private double income;
    private double expenses;
    private double saveAmount;
    private double spendAmount;
    //Budget

    //Score

    //Rank

    //Week Class

    //previous week

    //Curent week

    //Initial week

    /**
     * Constructor used when no parameters are passed
     * @param Nothing
     */
    public User(){

    }

    /**
     * Constructor used for CreateUser Profile
     * Constructs a user instance with 3 parameters
     * @param firstName
     * @param lastName
     * @param email
     */
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    /**
     * Constructor used to load saved
     * profile information.
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param income
     * @param expenses
     */
    public User(String firstName, String lastName, String email, double income, double expenses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.income = income;
        this.expenses = expenses;
    }

    /**
     * Get first name method
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get last name method
     *
     * @return lastName
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * Get email address method
     *
     * @return email
     */
    public String getEmail() {

        return email;
    }

    /**
     * Get income method
     *
     * @return income
     */
    public double getIncome() {

        return income;
    }

    /**
     * Get expenses method
     *
     * @return expenses
     */
    public double getExpenses() {

        return expenses;
    }

    /**
     * Get save amoung method
     *
     * @return saveAmount
     */
    public double getSaveAmount() {

        return saveAmount;
    }

    /**
     * Get spend amount method
     *
     * @return spendAmount
     */
    public double getSpendAmount() {
        return spendAmount;
    }

    /**
     * Set first name method
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * Set last anme method
     *
     * @param lastName
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * Set Email Method
     *
     * @param email
     */
    public void setEmail(String email) {

        this.email = email;
    }

    /**
     * Set Income method
     *
     * @param income
     */
    public void setIncome(double income) {

        this.income = income;
    }

    /**
     * Set expenses method
     *
     * @param expenses
     */
    public void setExpenses(double expenses) {

        this.expenses = expenses;
    }

    /**
     * Set save amount method
     *
     * @param saveAmount
     */
    public void setSaveAmount(double saveAmount) {
        this.saveAmount = saveAmount;
    }

    /**
     * Set spend amount method
     *
     * @param spendAmount
     */
    public void setSpendAmount(double spendAmount) {
        this.spendAmount = spendAmount;
    }

    /**
     * Override to string method in order to save
     * and load user data.
     *
     * @return firstName, lastName, email, income, expenses
     */
    @Override
    public String toString() {
        return
                firstName +
                        ", " + lastName +
                        ", " + email +
                        ", " + income +
                        ", " + expenses ;
    }
}