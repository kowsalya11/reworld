public class AscendingOrderProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("enter the element");
        int i,j;
        int temp=0;
        for(i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<s;i++){
        for(j=i+1;j<s;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }}
        System.out.println("ascending order");
    
        for(i=0;i<s-1;i++)
        {
            System.out.println(""+a[i]);
        }
        System.out.println(""+a[s-1]);
    
    }
}
