package prog;

public class Pattern3 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=4;col++)
			{
				if(col%2==0)   //(col==1||col==3)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
