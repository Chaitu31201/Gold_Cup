import java.io.*;
import java.util.*;
import java.math.*;
class  P2_18{
	public static void main(String xf[]){
		int a;
		Scanner gh= new Scanner(System.in);
		a=gh.nextInt();
		int vb=a;
		int cv=a;
		int count=0;
		while(a!=0){
			a/=10;
			count+=1;
		}
		double chai=0;
		while(vb!=0){
			chai=chai+(vb%10)*Math.pow(10,count-1);
			System.out.println(chai);
			vb/=10;
			count-=1;
		}
		if((int)chai==cv){
			System.out.println(cv+" is a palindrome");
		}
		else{
			System.out.println(cv+" is not a palindrome");
		}
		System.out.println(chai);
		System.out.println(cv);
	}
}
		