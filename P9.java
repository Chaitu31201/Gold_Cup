import java.util.*;
import java.io.*;
class P9{
	public static void main(String df[]){
		String gender=df[0];
		int age=Integer.parseInt(df[1]);
		if(df[0].compareTo("Male")==0){
			if(age>=1 && age<=60){
				System.out.println("Percentage of Interest is "+9.2);
			}
			else if (age>60 && age<=120){
				System.out.println("Percentage of Interest is "+8.3);
			}
			else{
				System.out.println("Invalid age");
			}
		}
		else if(df[0].compareTo("Female")==0){
			if(age>=1 && age<=58){
				System.out.println("Percentage of Interest is "+8.2);
			}
			else if (age>60 && age<=120){
				System.out.println("Percentage of Interest is "+9.2);
			}
			else{
				System.out.println("Invalid age");
			}
		}
		else{
			System.out.print("Invalid Gender");
		}
	}
}