import java.util.*;
import java.io.*;
import java.lang.*;
class PalindromeNumber
{
	public static void Pali(int x){
		int r = 0 , s = 0 ,n = 0 , t = x;
		while(t!=0){
			r = t % 10;
			s = (s*10)+r;
			t = t/10;
		}
		if(s == x){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pali(n);
	}
}