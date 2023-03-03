package prog;

public class Pattern18 {

	public static void main(String[] args) 
	{	int i=1;
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r>=c)
				{
					System.out.print(i);
					i++;
				}
			}
			System.out.println();
		}
	}

}
