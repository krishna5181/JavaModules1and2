package prog;

public class Pattern17 {

	public static void main(String[] args) 
	{
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r>=c)
					System.out.print(c);
			}
			System.out.println();
		}
	}

}
