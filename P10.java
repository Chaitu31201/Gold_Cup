import java.util.*;
import java.io.*;
class P10{
	public static void main(String s[]){
		char ch= s[0].charAt(0);
		if(Character.isUpperCase(ch)){
			System.out.println(ch+" ->"+Character.toLowerCase(ch));
		}
		else{
			System.out.println(ch+" ->"+Character.toUpperCase(ch));
		}
	}
	
}