package DSA;
import java.util.*;
public class SumPalindrome {
	
	public static int toReverse(int n) {
		int m=n;
		int k=0;
		int rev=0;
		while(m>0) {
			k=m%10;
			rev=rev*10+k;
			m=m/10;
		}
		return rev;
	}
	public String ispalindrome(int n,int rev) {
		int i=1000;
		int m=n+rev;
		while(i-->0) {
			if(m==toReverse(m)) {
				return "Palindrome, success";
			}
			m=m+toReverse(m);
		}
		return "Not exist";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumPalindrome sp=new SumPalindrome();
		int rev=toReverse(n);
		System.out.println(sp.ispalindrome(n,rev));
	}

}
