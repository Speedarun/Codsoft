import java. util. Scanner;
public class AtmInterface {
    public int balance = 5000;

    public void withdraw(int withdraw_amount){
        if(balance >= withdraw_amount){
            balance -= withdraw_amount;
            System.out.println("Withdrawing Amount Successfully");
        }
    }

    public void deposit(int deposit_amount){
        if(deposit_amount > 0){
            balance += deposit_amount;
            System.out.println("Deposit Amount Successfully");
        }
    }

    public void checkbalance(){
        System.out.println("Balance Amount: "+balance);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Interface.....");
        AtmInterface at = new AtmInterface();
        System.out.println("Choice 1 for Withdraw\nChoice 2 for Deposit\nChoice 3 for Check Balance\nOther for Exit");
        
        while(true){
            System.out.print("\nEnter Your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter Amount for Withdraw: ");
                int withdrawal = sc.nextInt();
                at.withdraw(withdrawal);
            }
            else if(choice == 2){
                System.out.print("Enter Amount for Deposit: ");
                int depositt = sc.nextInt();
                at.deposit(depositt);
            }
            else if(choice == 3){
                at.checkbalance();
            }
            else{
                sc.close();
                System.out.println("Balance: "+at.balance);
                System.out.println("Thank you come again...");
                return;
            }
        }
    }
}
