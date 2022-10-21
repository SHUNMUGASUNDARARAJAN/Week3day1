package week3day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input="noon";
       String reverse =" ";
       char[] array = input.toCharArray();
       
       for(int i =input.length() -1;i>=0;i--) {
    	   reverse=reverse + array[i];
    	   
       }
       System.out.println(reverse);
       if(reverse.equals(input)) {
    	   System.out.println("Input is a palindrome");
       }
       else 
    	   System.out.println("Input is not a palindrome");
	}

}
