public class Agestudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
 Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a]; int z[]=new int[a]; int y[]=new int[a];
        System.out.println("enter the element array");
        int i,j,c = 0;
        int temp=0,count=1;
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            for(j=i+1;j<a;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }           
        }
        System.out.println("ascending order");
        for(i=0;i<a-1;i++)
        {
            System.out.println(""+b[i]);
        }
        System.out.println(""+b[a-1]);
        System.out.println("smallest numder"+b[0]+"\n"+"biggest number"+b[a-1]);
    
      for(i=0;i<a;i++){count=1;
        if(b[i]==' '){continue;}
            
            for(j=i+1;j<a;j++)
            {
                if(b[i]==b[j])
                {
                    count++;
                  b[j]=' ';
                } }
                y[i]=count;
                z[i]=b[i];
            System.out.println(y[i]+"count"+z[i]+"age");
        }}
}
