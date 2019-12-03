import java.util.*;
import java.io.*;
class P8{
	public static void main(String chai[]){
		char ch=chai[0].charAt(0);
		if(ch>='a' &&  ch<='z'){
			System.out.println("Alphabet");

		}
		else if(ch>='A' && ch<='Z'){
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9'){
			System.out.println("Digit");
		}
		else{
			System.out.println("Special Character");
		}
	}
}