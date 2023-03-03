package prog;

public class PatternK4 {

	public static void main(String[] args) 
	{
		
		for(int r=1;r<=3;r++)
		{
			char ch='A';
		  for(int c=1;c<=3;c++)
		  {
			  if(r>=c)
			  System.out.print(ch);
			  ch++;
		  }
		  System.out.println();
		  
		}

	}

}
