import java.util.Scanner;
class Loop{
        int i=1,n;
        void forr()
    {
   
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        n=scan.nextInt();
        System.out.println("The numbers are: ");
    
        for(i=1;i<n+1;i++)
        System.out.println(i);
    }

    void whilee()
    {
         Scanner scan =new Scanner(System.in);
         int i=0,k;
        

        System.out.println("Enter nth value to print numbers from reverse: ");
        k=scan.nextInt();
        System.out.println("The numbers are: ");
        while(i<k)
    {
        System.out.println(k);
        k--;
    }
 }
    
}
    public class rev
    {
        public static void main(String[] args){
        Loop lo=new Loop();
        lo.forr();
        lo.whilee();
           
          
    }
}

    

