
/**
 * Write a description of class exercise2_13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        