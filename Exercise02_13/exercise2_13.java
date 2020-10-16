
/**
 *  Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.
 */
public class exercise2_13
{
    public static void main (String[]args)
    {
        double total=0;
        //the monthly intrest rate is 0.00417 
        
        //After first  month the value in account is
        total= (100* (1+0.00417));
        
        //After second month the value is
        total = (100 +total) *(1+0.00417);
        //After third month the value is 
        total = (100 +total) *(1+0.00417);
        //After fourth month the value is
        total = (100 +total) *(1+0.00417);
        //After fifth month the value is
        total = (100 +total) *(1+0.00417);
        //After sixth month the value is
        total = (100 +total) *(1+0.00417);
        //Display result
        System.out.println("the monthly saving is 100 and annual intrest Rate is 5%");
        System.out.println("After the sixth month, the account value is " + total);
    }
}
        
