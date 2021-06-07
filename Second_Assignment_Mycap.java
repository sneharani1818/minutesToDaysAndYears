/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_assignment_mycap;

/**
 *
 * @author Sushil Kumar
 */
import java.util.*;
public class Second_Assignment_MyCap {

    /**
     * @param args the command line arguments
     */
    int minutes;
    Second_Assignment_MyCap()
    {
        minutes=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER  UMBER OF MINUTES");
        minutes=sc.nextInt();
    }
    int returnYears()
    {
        return minutes/(60*24*365);
    }
    int returnDays()
    {
        int temp=returnYears();
        temp=minutes-(temp*60*24*365);
        return temp%24;
    }
    void display()
    {
        System.out.println("MINUTES:"+minutes);
        System.out.println("YEARS:"+returnYears());
        System.out.println("DAYS:"+returnDays());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Second_Assignment_MyCap obj=new Second_Assignment_MyCap();
        obj.input();
        obj.display();
        
    }
    
}
