public class Que_26 {
    public static void main(String args[])
    {
        int n=5;
        for (int i = 1; i <= n; i++) 
        {
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= 2*i-1; j++) 
            {
                System.out.print(j+" ");
            }  

            System.out.println();
            
        }
    }
}
