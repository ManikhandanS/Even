package Test;

public class Even 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				++count;
				
			}
		}

System.out.println("The Count of Even numbers are\t"+count);
	}
}

