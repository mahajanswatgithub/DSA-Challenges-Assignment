public class Que_12 {
    public static void main(String args[])
    {
        int n=5;
        int star=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("  ");
            }
         
            for(int j=0;j<star;j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("! ");
                }
            }
            star+=2;
            
            System.out.println();
        }
    }
}
