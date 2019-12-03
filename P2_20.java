import java.io.*;
import java.util.*;
class P2_20{
	public static void main(String xd[]){
	Scanner gh = new Scanner(System.in);
	char c;
		do{
		        c=gh.nextLine().charAt(0);
		        System.out.println("1.Add\n2. Sub");
		        int df=gh.nextInt();
		        int a=gh.nextInt();
		        int b=gh.nextInt();
		        switch(df){
			case 1: System.out.println(a+b);
				break;
			case 2:System.out.println(a-b);
				break;
			}
		       }while(c=='y' || c=='Y');
		}
	}