import java.util.*;
import java.io.*;
class P6{
	public static void main(String sd[]){
		if(sd.length>0){
			for(int i=0;i<sd.length-1;i++){
				System.out.print(sd[i]+",");
			}
	     		System.out.print(sd[sd.length-1]+".");
		}
		else{
			System.out.println("No Values");
		 }
	}
}
				