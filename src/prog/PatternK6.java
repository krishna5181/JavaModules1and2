package prog;

public class PatternK6 {

	public static void main(String[] args) 
	{	char ch = 'A';
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{	
				if(r>=c)
				{
					System.out.print(ch);
					ch++;
				}	
			}
			System.out.println();
		}
	}
}
