package prog;

public class Pattern2 {

	public static void main(String[] args)
	{
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=4;col++)
			{
				if(row%2!=0) //(row%2!=0) (row==1||row==3)
				{
				System.out.print("*");
				}
				else
				{					
				System.out.print("#");
				}
			}
			System.out.println();
			
		}
	}

}
