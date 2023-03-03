package prog;

public class PatternK10 
{
	public static void main(String[] args) 
	{
		for(int r=4;r>=1;r--)
		{	int k=1;
			for(int c=1;c<=4;c++)
			{
				if(c>=r)
				{
					System.out.print(k+" ");
					k++;
				}				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
