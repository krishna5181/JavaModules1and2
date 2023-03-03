package prog;

public class PatternK2 {

	public static void main(String[] args) 
	{
		char ch='A';
		for(int r=1;r<=3;r++)
		{
		  for(int c=1;c<=3;c++)
		  {
			  if(r>=c)
			  System.out.print(ch);
		  }
		  System.out.println();
		  ch++;
		}
	}
}
