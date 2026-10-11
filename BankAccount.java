import java.util.*;
public class BankAccount {
    Scanner s = new Scanner(System.in);
    double balance, dAmt, wAmt;

    void deposite() {
        System.out.print("Enter amount to store: ");
        dAmt=s.nextDouble();
        if(dAmt<0)
        {
            System.out.println("Insufficient Amount");
        } else {
            balance += dAmt;
        }
    }

    void withdraw() {
        System.out.print("Enter withdraw amount: ");
        wAmt = s.nextDouble();
        if (wAmt >= balance) {
            System.out.println("Insufficient Amount");
        } else {
            balance -= wAmt;
        }
    }

    void getBalance() {
        System.out.println("Total Balance = "+balance);
    }

    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        int ch;
        do {
            System.out.print("1: Deposite\n2:Withdraw\n3:View Balance\n4:Exit\nEnter Choice: ");
            ch=ba.s.nextInt();
            switch(ch)
            {
                case 1:ba.deposite();
                break;
                case 2:ba.withdraw();
                break;
                case 3:ba.getBalance();
                break;
                case 4: System.exit(0);
                break;
                default:System.out.println("Select only valid option");
            }
        }while(ch<=4);
    }
}
