package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="stops";
      String b="posts";
      String x=a.toLowerCase();
      String y=b.toLowerCase();
      
      char[] ch1=x.toCharArray();
      char[] ch2=y.toCharArray();
      
      
      int lengthfirst=x.length();
      int lengthsecond=y.length();
      
      
      Arrays.sort(ch1);
      String one=Arrays.toString(ch1);
      System.out.println(one);
      Arrays.sort(ch2);
      String two=Arrays.toString(ch2);
      System.out.println(two);
      
      
      if(lengthfirst==lengthsecond)
      {System.out.println("check for Anagram");
      }
      else System.out.println("given word is not Anagram");
      
      
      if((one).equals(two)) {
    	  System.out.println("the word is an Anagram");}
      else {
    	  System.out.println("the word is not an Anagram");
      } 
	}
      
      
	}


