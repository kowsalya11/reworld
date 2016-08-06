 
public class Amount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       int sum=0,d;
       int amount=1210;
      int a[]=new int[2];
      int b[]=new int[2];
      int c[]=new int[2];
      for(int i=0;i<2;i++)
      {
          a[i]=sc.nextInt();
           }
      for(int i=0;i<2;i++)
      {
       b[i]=sc.nextInt();
      }
      for(int i=0;i<2;i++){
          c[i]=a[i]/b[i];
          sum=c[0]+c[i];
            
                   
      }
    d=amount/sum;
    System.out.println("b amount"+2*d);
      
    }
}