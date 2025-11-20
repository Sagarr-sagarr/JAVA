
class demo{

    

    void test(){
        System.out.println("no parameter is there.");


    }



    

    void test (int a ,int b){
        System.out.println("value of a is: " + a + " \nvalue of b is: " + b);

    }

    double test(double a){
       
       
       
       return a+a;

    }


}

public class sample{
    public static void main(String[] args) {

        
        demo mybox=new demo();
       
        double res;
      
        



        
        mybox.test();
        
        mybox.test(10,20);
        res=mybox.test(300.0000);
        System.out.println("double: " + res);
     

    }}

       

