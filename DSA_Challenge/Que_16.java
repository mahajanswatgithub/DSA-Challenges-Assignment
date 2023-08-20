public class Que_16 {
    
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            //spaces
            for(int j=i;j<n-1;j++){
                System.out.print("   ");
            }
            //star

            for(int j=i;j<n;j++){
                System.out.print("  *");
            }
            System.out.println();
        }

        for(int i=n-2;i>=0;i--){
            //spaces
            for(int j=i;j<n-1;j++){
                System.out.print("   ");
            }
            //star

            for(int j=i;j<n;j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }

}
       