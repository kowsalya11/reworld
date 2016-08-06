public class Ascendingpower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[4];
        
       // String n1=sc.nextLine();
        //int ln=(int)n1.length();
        int i,j,c=0,n=0;
        int count=1;
        for(i=0;i<=a.length;i++)
        {
         Scanner sc=new Scanner(System.in);   
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<=a.length;i++)
        {
            for(j=1;j<=i+1;j++)
            {
           count= a[i]*a[j];//count;
           
            }
       n=n+count;
       count=1;
        }
        System.out.println(""+n);
    }
}
