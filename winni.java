public class Consonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner sc=new Scanner(System.in);
       char gh=sc.next().charAt(0);
       if(gh=='A' || gh=='a' || gh=='I' || gh=='i' || gh=='E' || gh=='e' || gh=='O' || gh=='o' || gh=='U' || gh=='u')
       {
           System.out.println("it is vowel");
        
    }
       else
       {
           System.out.println("it is a consonant");
       }
    }
}