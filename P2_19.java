import java.io.*;
import java.util.*;
class P2_19{
	public static void main(String xd[]){
		int count=5;
		int i=0;
		while(count!=0){
			if(i%2==0&&i%3==0&&i%5==0){
				System.out.println(i);
				count--;
			}
			i+=1;
		}
	}
}