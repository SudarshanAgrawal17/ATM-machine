import java.util.*;

public class AtmOperationImpl implements AtmOperationInterf {
    ATM atm = new ATM();
    class Pair{
        double amount;
        String action;
        public Pair(double amount, String action){
            this.amount = amount;
            this.action = action;
        }
    }
    List<Pair> list = new ArrayList<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance: "+atm.getBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " Deposited Successfully!");
        atm.setBalance(depositAmount + atm.getBalance());
        viewBalance();
        list.add(new Pair(depositAmount, " Amount Deposited"));
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount > atm.getBalance()){
            System.out.println("Insufficient Balance!");
            viewBalance();
            return;
        }
        System.out.println("Collect the case: "+withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount);
        list.add(new Pair(withdrawAmount, " Amount Withdrawn"));
    }

    @Override
    public void viewMiniStatement() {
        for(Pair p:list){
            System.out.println(p.amount+p.action);
        }
    }
}
