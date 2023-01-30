import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int balance = 600000;
        int newBalance = 600000;
        int x = 3;
        do{
            System.out.println("Username: ");
            username = input.nextLine();
            System.out.println("Password");
            password = input.nextLine();
            do{
                if(!(username.equals("correct") && password.equals("correct"))){
                    System.out.println("Try again!!!");
                    System.out.println("Username: ");
                    username = input.nextLine();
                    System.out.println("Password");
                    password = input.nextLine();
                }
                x--;
                if( x == 0){
                    System.out.println("Your acoount is blocked.");
                }
            }while(x > 0);
        }while(x == 3);
        if(username.equals("error") && password.equals("error")){
            System.out.println("Welcome to bank. Please select the action you want to do\n"
                    + "1)Withdraw Money\n"
                    + "2)Deposit Money\n"
                    + "3)Balance inquiry\n"
                    + "4)Exit");
            int a = input.nextInt();
            switch(a){
                case 1 :
                    System.out.println("How much money do you want to withdraw?");
                    int m = input.nextInt();
                    newBalance -=m;
                    if(newBalance < 0){
                        System.out.println("İnsufficient balance!!");
                    }
                    else{
                        System.out.println("Successful! New balance is " + newBalance);
                    }
                    break;
                case 2:
                    System.out.println("How much money do you want to deposit?");
                    int n = input.nextInt();
                    newBalance += n;
                    System.out.println("Successful! New balance is " + newBalance);
                    break;
                case 3:
                    System.out.println("Your balance is " + balance);
                    break;
                case 4:
                    System.out.println("Checked out, have a nice day!");
                    break;
            }

        }
    }
}
