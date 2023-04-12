import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AtmOperationInterf ob = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM Number: ");
        int atmNum = sc.nextInt();
        System.out.print("Enter ATM Pin: ");
        int atmP = sc.nextInt();

        if(!(atmNumber == atmNum && atmPin == atmP)){
            System.out.println("Incorrect ATM Number or Pin!");
            System.exit(0);
        }

        while(true){
            System.out.println("1. View Available Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. View Mini Statement");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                ob.viewBalance();
                break;

                case 2:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                ob.depositAmount(deposit);
                break;

                case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                ob.withdrawAmount(withdraw);
                break;

                case 4:
                ob.viewMiniStatement();
                break;

                case 5:
                System.out.println("Collect Your ATM Card.");
                System.exit(0);
                break;

                default:
                System.out.println("Please enter a valid choice.");
                break;
            }
        }
    }
}