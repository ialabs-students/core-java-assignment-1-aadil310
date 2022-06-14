package assignment04;

import java.util.Scanner;

public class ATM {
    //global decleration....
    int TwoThousands, FiveHundreds, TwoHundreds, Hundreds;
    int total_amount = 0;
    int withdraw_amount = 0;

    public void deposit() {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the No. of 2000's note");
       TwoThousands=sc.nextInt();
       System.out.println("Enter the No. of 500's note");
       FiveHundreds=sc.nextInt();
       System.out.println("Enter the No. of 200's note");
       TwoHundreds=sc.nextInt();
       System.out.println("Enter the No. of 100's note");
       Hundreds=sc.nextInt();

       if(TwoThousands<0 ||FiveHundreds<0 || TwoHundreds<0 ||Hundreds<0){
           System.out.println("incorrect deposit amount.....");
       }
       else if(TwoThousands==0 && FiveHundreds==0 && TwoHundreds==0 && Hundreds==0){
           System.out.println("deposit amount cannot be zero");
        }
        else{
            int total_2000s=TwoThousands*2000;
            int total_500s=FiveHundreds*500;
            int total_200s=TwoHundreds*200;
            int total_100s=Hundreds*100;
            total_amount=total_100s+total_2000s+total_200s+total_500s;
            System.out.println("Balance:"+" "+"2000s="+TwoThousands+" "+"500="+FiveHundreds+" "+"200="+TwoHundreds+" "+"100="+Hundreds);
        }
        System.out.println("Your total amount is:"+total_amount);
        //call once again..
        menu();
    }

    public void withdraw() {
        int left_amount=0;
        System.out.println("Enter how much amount you want to withdraw:");
        Scanner sc=new Scanner(System.in);
        int withdraw_amount=sc.nextInt();

        if(withdraw_amount>total_amount){
            System.out.println("insufficient balance.....");
        }else{
            left_amount=total_amount-withdraw_amount;
            total_amount=left_amount;
            while(left_amount!=0)
            {
                if(left_amount>2000)
                {
                    TwoThousands=left_amount/2000;
                    left_amount=left_amount-TwoThousands*2000;
                }
                else if(left_amount>500)
                {
                    FiveHundreds=left_amount/500;
                    left_amount=left_amount-FiveHundreds*500;
                    
                }
                else if(left_amount>200)
                {
                    TwoHundreds=left_amount/200;
                    left_amount=left_amount-TwoHundreds*200;

                }
                else {
                    Hundreds=left_amount/100;
                    left_amount=left_amount-Hundreds*100;
                }
            }
            System.out.println("Balance:"+" "+"2000s="+TwoThousands+" "+"500="+FiveHundreds+" "+"200="+TwoHundreds+" "+"100="+Hundreds);
            System.out.println("your total amount left is "+total_amount);
        }
        menu();

    }

    public void exit() {
        System.exit(0);
    }

    public void menu() {
        System.out.println("plz Enter the choice: \n press 1. for depositing the money \n press 2. for withdraw your money \n press 3. exit the program");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            deposit();
            break;
            case 2:
            withdraw();
            break;
            case 3:
            exit();
            break;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.menu();

    }

}
