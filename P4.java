import java.util.*;
import java.io.*;
class P4{
	public static void main(String s[]){
		if(Integer.parseInt(s[0])>0){
			System.out.println("Positive Number");
		}
		else if(Integer.parseInt(s[0])<0){
			System.out.println("Negative Number");
		}
		else{
			System.out.println("Zero");
		}
	}
}