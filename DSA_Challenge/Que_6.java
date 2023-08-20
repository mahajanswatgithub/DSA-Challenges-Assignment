public class Que_6 {
    public static void main(String[] args) 
	{
		int n=5;
	   
	    int space = 0;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=space*2;j++)
            {
                System.out.print("  ");
            }
	        for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
	        System.out.println();
	        space++;
	    }
		
	}
}
