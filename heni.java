public class Stringrevarsal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         String s1;
        
       // char[] c=new char[100];
        char[] a=new char[100];
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
      char[] c;
        c = s1.toCharArray();
        int b=s1.length();
       if(b<=3)
        {
            System.out.println(""+s1);
        }
       else
for(int i=0;i<b;i++)
{
    for(int j=b-1;j>i;j--)
    {
        if(i>j&&i==j)
        {
            break;
        }
      else
      
        if(c[i]==c[j])
        {
            a[i]=c[i];
        }}
            System.out.print(""+a[i]);
            
    
}
        
    }
    
        
    }