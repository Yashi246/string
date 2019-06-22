package Labbook3;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JTextField;

public class Exercise2 {
	public static void main(String[] args) {
		int l =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		String[] Myarray = new String[n];
		System.out.println("please enter names to sort");
		Scanner sc1 = new Scanner(System.in);
		for(int i =0;i<n; i++)
		{
			Myarray[i]=sc1.nextLine();
			//l=Myarray.length;
			
			
		}
		for(int j =0;j<n; j++)
		{
			
	int l1 = Myarray.length;
		Arrays.sort(Myarray);
		if(j<l1/2)
		{
			Myarray[j]= Myarray[j].toUpperCase();
		}}
		for(int i=0;i<n;i++) {
		System.out.println(Myarray[i]);
		}
		
		}
		}

	
	