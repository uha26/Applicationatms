import java.util.Scanner;
public class index{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer name:");
        String customer1=sc.next();
        System.out.println("enter the customer id:");
        String customeri=sc.next();
        BankAccount bank1=new BankAccount(customer1,customeri);
        bank1.showmenu();
        

    }
   
}
 class BankAccount
    {
        int balance;
        int previoustransaction;
        String customername;
        String customerid;
        BankAccount(String cname,String cid)
        {
            customername=cname;
            customerid=cid;

        }
        void deposit(int amount)
        {
            if(amount!=0)
            {
                balance=balance+amount;
                previoustransaction=amount;
            }
        }
        //amount 
        void withdraw(int amount)
        {
            if(amount!=0)
            {
                balance=balance-amount;
                previoustransaction=-amount;
            }
        }
        void getprevioustransaction()
        {
            if(previoustransaction>0)
            {
                System.out.println("deposited: "+previoustransaction);
            }
            else if(previoustransaction<0)
            {
                System.out.println("withdrawn: "+Math.abs(previoustransaction));
            }
            else{
                System.out.println("No Transaction Occured");
            }
        }
        void showmenu()
        {
            char option='\0';
            Scanner sc=new Scanner(System.in);
            System.out.println("Welcome "+customername);
            System.out.println("Your ID is: "+customerid);
            System.out.println();
            System.out.println("A . CHECK BALANCE");
            System.out.println("B. DEPOSIT");
            System.out.println("C. WITHDRAW");
            System.out.println("D. PREVIOUS TRANSACTION");
            System.out.println("E . EXIT");
            do{
                System.out.println("-------------------------");
                System.out.println("ENTER THE OPTION");
                System.out.println("---------------------");
                option=sc.next().charAt(0);
                Character.toUpperCase(option);
                switch(option)
                {
                    case 'A':
                        System.out.println("---------------");
                        System.out.println("Balance is "+balance);
                           System.out.println("---------------");
                              System.out.println();
                        break;
                    case 'B':
                           System.out.println("---------------");
                              System.out.println("ENTER THE AMOUNT TO DEPOSIT:");
                                 System.out.println("---------------");
                                 int amount=sc.nextInt();
                                 deposit(amount);
                                 System.out.println();
                                 break;
                    case 'C':
                         System.out.println("---------------");
                              System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
                                 System.out.println("---------------");
                                 int amount2=sc.nextInt();
                                 withdraw(amount2);
                                 System.out.println();
                                 break;
                   case 'D':
                       System.out.println("---------------");
                             getprevioustransaction();
                                 System.out.println("---------------");
                                 System.out.println();
                                 break;
                    case 'E':
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("Invalid option! Please Try Again");
                        break;
                        




                        
                }


            }while(option!='E');

        }

}

    