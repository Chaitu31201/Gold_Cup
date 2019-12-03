import java.io.*;
import java.util.*;
class P2_12{
	public static void main(String fs[]){
		int a;
		Scanner jk = new Scanner(System.in);
		System.out.println("enter the number: ");
		a=jk.nextInt();
		int k=45;
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				System.out.println(a+" is not a prime number");
				k=89;
				break;
			}
		}
		if(k==45){
			System.out.println(a+" is a prime number");
			}
		}
	}