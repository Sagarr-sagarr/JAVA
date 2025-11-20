import java.util.Scanner;
class Account{
    int accno;
    String holname;
    String type;
    double balance;
  


    void getdata(){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number: ");
        accno=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the account holder name: ");
        holname=sc.nextLine();
        System.out.println("enter the type(savings/business) of account: ");
        type=sc.nextLine();
        System.out.println("enter the current balance: ");
        balance=sc.nextDouble();



    }

    void dispalydata(){

        System.out.println("--Account details--");
        System.out.println("Account number: "+accno);
        System.out.println("Account holder name: "+holname);
        System.out.println("Account thype: "+type);
        System.out.println("Current balance: "+balance);


    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited amount: "+amount);

    }

    void withdrawl(double amount){
        if(amount>balance)
        System.out.println("Not sufficient kbalnce to withdraw amount.");
        else{
            balance-=amount;
            System.out.println("Withdrwal amount: "+amount);

        }
    }


}


public class bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account a=new Account();

        a.getdata();
        a.dispalydata();

        System.out.println("Enter the amont to be deposited: ");
         double dep=sc.nextDouble();
         a.deposit(dep);

        System.out.println("Enter the amont to be withdrwan: ");
        double wd=sc.nextDouble();
        a.withdrawl(wd);

        System.out.println("--After transactions---");

        a.dispalydata();


    }
}

