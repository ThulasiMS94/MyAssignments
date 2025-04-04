package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int num=5445;
		int temp=num;
		int rev=0,rem;
		while(temp!=0) {
			
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
			if(num==rev) {
				System.out.println(num+" is a palindrome");
			}
			
			else {
				System.out.println(num+" is not a palindrome");
			}
	}

}
