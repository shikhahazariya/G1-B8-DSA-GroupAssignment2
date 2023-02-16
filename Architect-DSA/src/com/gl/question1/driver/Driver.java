package com.gl.question1.driver;

import java.io.IOException;
import java.util.Scanner;

import com.gl.question1.service.Service;

public class Driver {
	public static void main(String arg[])throws IOException{
		int []floor;
		int numberoffloor;
		Scanner sc=new Scanner(System.in);
		//take the height of building from user
		System.out.println("Enter the total floor in the building ");
		numberoffloor=sc.nextInt();
		floor=new int[numberoffloor];
		// floor size for particular day
		for(int i=0; i<numberoffloor; i++) {
			System.out.println("enter the floor size given on day:"+(i+1));
			floor[i]=sc.nextInt();
		}
			
			System.out.println();
			Service service=new Service();
			service.constructionTable(floor);
		
		
		
	}

}
