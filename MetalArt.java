/*********************************************************
Natalie Murphy
Project 2 Metal Art
**********************************************************
This project will calculate the total cost of building a 
model of the sculpture presented by calculating the size 
and rectangular prism taken from the user's input.
**********************************************************
February 2019
CMSC 255 Section 003
Java Version 9.0.4
**********************************************************/
import java.util.Scanner;
public class MetalArt {
	public static void main (String[]args) {
		final double MATERIAL_COST = 1.67;
		String sculptureName;
		double lengthOfBase1;
		double heightOfPyramid1;
		double lengthOfBase2;
		double heightOfPyramid2;
		double slantPyramidLength1;
		double slantPyramidLength2;
		double basePyramidArea1;
		double basePyramidArea2;
	    	double surfacePyramidArea1;
		double surfacePyramidArea2;
		double prismSurfaceArea;
		double prismHeight;
		double prismWidth;
		double prismLength;
		double totalSurfaceArea;
		double totalCost;
	
	Scanner scnr = new Scanner (System.in);
		 // Asking user for name of sculpture //
	System.out.println ("Please enter the name of sculpture.");
	sculptureName = scnr.nextLine();
		// Asking user for the length of the base for the first pyramid //
	System.out.println ("Please enter the length of the base for the first pyramid in inches.");
	lengthOfBase1 = scnr.nextInt();
		// Asking user for the height of the first pyramid //
	System.out.println ("Please enter the height of the first pyramid in inches.");
	heightOfPyramid1 = scnr.nextInt();
		// Asking user for the length of the base for the second pyramid //
	System.out.println ("Please enter the length of the base for the second pyramid in inches.");
	lengthOfBase2 = scnr.nextInt();
		// Asking user for the height of the second pyramid //
	System.out.println ("Please enter the height of the second pyramid in inches.");
	heightOfPyramid2 = scnr.nextInt();
		// Asking user for the height of the rectangular prism //
	System.out.println ("Please enter the height of the rectangular prism in inches.");
	prismHeight = scnr.nextInt();
		// Asking user for the width of the rectangular prism //
	System.out.println ("Please enter the width of the rectangular prism in inches.");
	prismWidth = scnr.nextInt();
		// Asking user for the length of the rectangular prism //
	System.out.println ("Please enter the length of the rectangular prism in inches.");
	prismLength = scnr.nextInt();
		// Calculating the slant length of pyramid 1 using the formula //
	slantPyramidLength1 = (Math.sqrt ((0.5 * lengthOfBase1) * (0.5 * lengthOfBase1) + (heightOfPyramid1 * heightOfPyramid1)));
		// Calculating the slant length of pyramid 2 using the formula //
	slantPyramidLength2 = (Math.sqrt ((0.5 * lengthOfBase2) * (0.5* lengthOfBase2) + (heightOfPyramid2 * heightOfPyramid2)));
		// Calculating the base area of pyramid 1 using the formula //
	basePyramidArea1 = (0.5 * lengthOfBase1 * (Math.sqrt ((lengthOfBase1 * lengthOfBase1) - (0.5 * lengthOfBase1) * (0.5 * lengthOfBase1))));
		// Calculating the base area of pyramid 2 using the formula //
	basePyramidArea2 = (0.5 * lengthOfBase2 * (Math.sqrt ((lengthOfBase2 * lengthOfBase2) - (0.5 * lengthOfBase2) * (0.5 * lengthOfBase2))));
		// Calculating the surface area of pyramid 1 using the formula //
	surfacePyramidArea1 = basePyramidArea1 + (0.5 * 3 * lengthOfBase1 * slantPyramidLength1);
		// Calculating the surface area of pyramid 2 using the formula //
	surfacePyramidArea2 = basePyramidArea2 + (0.5 * 3 * lengthOfBase2 * slantPyramidLength2);
		// Calculating the surface area of the rectangular prism //
	prismSurfaceArea = (2 * prismLength * prismWidth) + (2 * prismLength * prismHeight) + (2 * prismWidth * prismHeight);
		// Calculating the total surface area //
	totalSurfaceArea = surfacePyramidArea1 + surfacePyramidArea2 + prismSurfaceArea;
		// Calculating the total cost for the sculpture using the formula //
	totalCost = MATERIAL_COST * totalSurfaceArea;
		// Displaying the output for the sculpture starting with name //
	System.out.println ("The " + sculptureName + " surface area calculations are:");
		// Displaying the surface area of the first pyramid //
	System.out.printf ("Surface area of the first pyramid: %,.2f%n", surfacePyramidArea1, ("square inches"));
		// Displaying the suface area of the second pyramid //
	System.out.printf ("Suface area of the second pyramid:  %,.2f%n", surfacePyramidArea2, ("square inches"));
		// Displaying the surface area of the rectangular prism //
	System.out.printf ("Surface area of the rectangular prism: %,.2f%n", prismSurfaceArea, ("square inches"));
		// Displaying the total surface area //
	System.out.printf ("The total surface area is: %,.2f%n", totalSurfaceArea , ("square inches"));
		// Displaying the total cost for the sculpture //
	System.out.printf ("The total cost for the sculpture is: $%,.2f%n", totalCost);

		






	}
}

