package sample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s=new Scanner(System.in);
		        String n=s.nextLine();
		        String r="^[a-z]([a-z,0-9]+\\s+\\w{0,})[0-9]$";
		        String r1="\\D.+\\s+.+\\d";
		        String r2="^[a-zA-Z].+\\s.+[0-9]$";
		        String r3="^.[_$!]{0,1}.*";
		        Pattern p=Pattern.compile(r3);
		        Matcher m=p.matcher(n);
		        System.out.println(m.matches());
		}
	}

