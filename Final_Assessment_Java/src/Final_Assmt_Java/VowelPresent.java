package Final_Assmt_Java;

import java.util.Scanner;

public class VowelPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=false;
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				flag=true;
			
			}
			else {
				flag=false;	
			}
			if(flag==true) {
				System.out.println("Yes");
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("No");
		}
		
	}

}
