public class Que_25 {
    public static void main(String args[])
    {
        int n=5;
        int num=1;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print("\t");
            }
            for (int k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
