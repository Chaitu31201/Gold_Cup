import java.util.*;
import java.io.*;
class P2_16{
	public static void main(String df[]){
		Scanner hg = new Scanner(System.in);
		int a=hg.nextInt();
		for(int i=0;i<=a;i++){
			for(int j=0;j<a;j++){
				if((i+j)<2*i){
					System.out.print('*');
				}
				else{
					System.out.print(' ');
				}
			}
		System.out.print("\n");
	}
   }
}