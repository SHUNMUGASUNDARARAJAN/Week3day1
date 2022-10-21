package week3day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text="We learn java basics as a part of java sessions in java week1";
        int count=0;
        
        
        String me[]=text.split(" ");
        String output="";
        
        for(int i=0;i<me.length;i++)
        { 
        
		for(int j=i+1;j<me.length;j++)
        {	
        	if(me[i].equals(me[j]))
        	{
        		count++;
        		if(count!=0)
        		me[j]=" ";
        	}
        	}
            }
        
              if(count!=0)
              {
            	  count=0;
              }
	
	for(String word : me )
		output=output+" "+word;{

       System.out.println(output);      
              
		}
	}}

