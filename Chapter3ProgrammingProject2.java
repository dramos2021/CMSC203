/*
A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
Quantity Discount
10-19 20%
20-49 30%
50-99 40%
100 or more 50%
Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount. For instance, to calculate 20% of a value N, you can use the formula:
(20 / 100.0) * N (or 0.2 * N).

Sample Run
java SoftwareSales

Enter number of packages purchased: 50↵
Your discount is: $1980.00↵
Your total is: $2970.00↵

*/


import java.util.Scanner;

public class SoftwareSales{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double total = 0;
    double discount = 0;
    int quantity;
    final int PACKAGE = 99;
    
    System.out.print("Enter the number of packages purchased: ");
    quantity = input.nextInt();
    
    if (quantity >= 0 && quantity < 10 ) {
    	total = quantity * PACKAGE;
    	
    }
    else if(quantity >= 10 && quantity < 20) {
    	total = quantity * (PACKAGE * .2);
    	discount = quantity * PACKAGE - total;
    }
    else if(quantity >= 20 && quantity < 50) {
    	total = quantity * (PACKAGE * .3);
    	discount = quantity * PACKAGE - total;
    }
    
    else if(quantity >= 10 && quantity < 100) {
    	total = quantity * (PACKAGE * .4);
    	discount = quantity * PACKAGE - total;
    }
    
    else if(quantity >= 100) {
    	total = quantity * (PACKAGE * .5);
    	discount = quantity * PACKAGE - total;
    }
    else {
    	System.out.print("Invalid Entry");
    	System.exit(0);
    }
    
    System.out.println("Your discount is: $" + discount);
    System.out.print("Your total is: $" + total);
    
    
    input.close();
	}
}
    