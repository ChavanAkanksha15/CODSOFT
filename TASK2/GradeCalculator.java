package Task2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of Subjects ...");
		int sub=sc.nextInt();
		
		int[] mark=new int[sub];
		
		for(int i =0; i < sub; i++) {
			System.out.println("Enter marks of subject "+(i+1)+":");
			mark[i]=sc.nextInt();
			
		}
		int total=0;
		for(int marks:mark) {
			 total += marks;
		}
		double average=(double) total/sub;
		
		char grade;
		if(average>= 90) {
			grade='A';
		}else if(average>=80) {
			grade='B';
		}else if(average>=70) {
			grade='C';
		}else if(average>=60) {
			grade='D';
		}else
		{
			grade='F';
		}
		
		System.out.println("Total Marks: "+total);
		System.out.println("Average Percentage: "+average+ "%");
		System.out.println("Grade: "+grade);
	}

}
