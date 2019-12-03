import java.io.*;
import java.util.*;
class P2_14{
	public static void main(String fd[]){
		Scanner hj = new Scanner(System.in);
		int i,j,a;
		System.out.println("enter the number: ");
		a=hj.nextInt();
		int flg=56;
		if(a==0 || a==1){
			System.out.println(a+" is neither prime nor composite");
			}
		else{
		for(i=2;i<=a/2;i++){
			if(a%i==0){
				flg=67;
				break;
			}
		}
		if(flg==67){
			System.out.println(a+" is not a prime number");
			}
		else{
			System.out.println(a+" is a prime number");
		}
		}
	}
}