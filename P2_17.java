import java.util.*;
import java.io.*;
class P2_17{
	public static void main(String d[]){
		int a;
		Scanner gh = new Scanner(System.in);
		a=gh.nextInt();
		do{
			System.out.print(a%10);
			a=a/10;
		}while(a!=0);
	}
}