import java.io.*;
import java.util.*;
class P2_13{
	public static void main(String df[]){
		int flg=67;
		for(int i=10;i<100;i++){
			for(int j=2;j<=i/2;j++){
				flg=67;
				if(i%j==0){
					flg=78;
					break;
				}
			}
			if(flg==67){
				System.out.println(i);
			}
		}
	}
}
				