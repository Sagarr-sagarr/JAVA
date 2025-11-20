import java.util.Scanner;

class learn{
     void check(){
        
        Scanner sgr=new Scanner(System.in);

        
            System.out.println("how many times you want check:");
            int times=sgr.nextInt();

        for(int i=0;i<times;i++) {

            
             
            
            System.out.println("enter a number:");
        int n=sgr.nextInt();
        if((n%3==0)&&(n%5==0))  {
            System.out.println("fizzbuzz");
        }
            
         else if (n%5==0){
            System.out.println("buzz");
         }
        
        else if(n%3==0){
            System.out.println("fizz");
        }

        else{
            System.out.println("same number: "+n);

        }
        
        
    } 
    System.out.println("exiting......");
 }
}
public class fizzbuzz{
             public static void main(String[] args){
                
             Scanner sagar=new Scanner(System.in);
             learn jav=new learn();

             jav.check();           }}
    

        

            
        

    
  

    

   






