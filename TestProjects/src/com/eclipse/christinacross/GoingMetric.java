/**
 * 
 */
package com.eclipse.christinacross;

/**
 * @author chriscross
 *
 */
import java.util.Scanner;
public class GoingMetric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter feet");
		Double feet = input.nextDouble();
		Double meters = feet * 0.305;
		System.out.println(feet +" feet is " + meters + " meters");
	}

}
