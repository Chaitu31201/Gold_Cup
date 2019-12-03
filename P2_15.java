import java.io.*;
import java.util.*;
class P2_15{
	public static void main(String cf[]){
		Scanner jg = new Scanner(System.in);
		System.out.println("Enter the number");
		String jk=jg.nextLine();
		int sum=0;
		for(int i=0;i<jk.length();i++){
			sum+=Character.getNumericValue(jk.charAt(i));
		}
		System.out.println(jk+"->"+sum);
	}
}
		