public class Que_21 {
    public static void main(String[] args)
    {
        int n=5;

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-3;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                if(i==1 && j==1)
                {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}

/*
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
*/