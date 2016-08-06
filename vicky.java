public class EncryptAdd {

    /**
     * @param args the command line arguments
     */
    public static int output1;
    public static int output2;
    public static void main(String[] args) {
        // TODO code application logic here
     int a[]={-44,-37,-31,23,0,-6,83,110,74,53};
     int b=a.length;
     
     int z=0;
             int i;
             for(i=b-2;i>=0;i--)
             {
                 a[i]=a[i]-a[i+1];
                 z=z+a[i];
                 
             }
             System.out.println(""+z);
             System.out.println(""+a[0]);
             
     
    }
}
