package com.eclipse.christinacross;
import java.util.Scanner;
public class TotalCost {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Input the price
		System.out.println("Enter the price of an item: ");
		double price = input.nextDouble();
		
		//Input the sales tax
		System.out.println("Enter the sales tax rate: ");
		double salesRate = input.nextDouble();
		
		//Compute the total cost 
		double totalCost = price + salesRate;
		System.out.println("The total cost of the item is $" + totalCost);
	}

}