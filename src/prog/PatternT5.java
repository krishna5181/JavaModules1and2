package prog;

public class PatternT5 
{
	public static void main(String[] args) 
	{
		int star=1,space=0;
		for(int i=1;i<=7;i++)
	  {
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		System.out.println();
		if(i<4)
		{
		star+=1;
		}
		else
		{
			star-=1;
		}
	  }
	}
}