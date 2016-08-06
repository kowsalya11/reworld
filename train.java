public class Train {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the number");
         Scanner s=new Scanner(System.in);
        int c,d,e,f;
       
        System.out.println("enter the sring");
         String z=s.nextLine();
        String w="+",y="-",x="*",v="/";
        
        if(z.equals(w))
        {
            c=a+b;
            System.out.println(""+c);
        }
        if(z.equals(y))
        {
            d=a-b;
            System.out.println(""+d);
        }
        if(z.equals(x))
        {
            e=a*b;
            System.out.println(""+e);
        }
        if(z.equals(v))
        {
            f=a/b;
            System.out.println(""+f);
        }
    }
}