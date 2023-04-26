package week1.day2;

public class Palindrome {              //Check the given number is palindrome or not 

	public static void main(String[] args) {
		int num = 34343;               //Int num =34343

		int temp = num;               //Initialize a  temporary variable.

		int reversed = 0;

		for (temp=num; temp != 0; temp =temp/10) {  //Reverse the number (using for loop and add to the temporary variable)
		    int digit = temp % 10;
		    reversed = reversed * 10 + digit;
		}

		if (num == reversed) {                //Compare the temporary number with reversed number

		    System.out.println(num + " is a palindrome number.");  //If both numbers are same, print "palindrome number"
		} else {
		    System.out.println(num + " is not a palindrome number."); //Else print "not palindrome number"

		}
	}
}
	
		

	
	
			
		
		
		

		
       

		
	