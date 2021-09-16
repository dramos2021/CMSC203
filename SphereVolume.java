import java.util.Scanner;
public class SphereVolume 
{ 
public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
	System.out.println("**********	This program calculates the volume of a sphere  	**********\n");
	
	System.out.println("Enter the diameter of the a sphere: ");
	double diam = input.nextDouble();
	double radius = diam / 2;
	double volume = (4/3.0) * (Math.PI * Math.pow(radius,3));
	
	System.out.println("The volume of the sphere of diameter "+ diam + " is " + volume + " cubic meters.");


 

	} 
} 

