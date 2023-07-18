package Day05.practice;

public class Main {
    public static void main(String[] args) {
        // Create an AxisATM object
        Account axisAccount = new Account("AX001", 8000);
        ATM axisATM = new AxisATM(axisAccount);

        // Deposit money
        axisATM.deposit(axisAccount, 3000);
        System.out.println("Account balance after deposit: " + axisATM.getBalance());

        // Withdraw money
        try {
            boolean success = axisATM.withdraw(axisAccount, 10000);
            if (success) {
                System.out.println("Withdrawal successful. Account balance: " + axisATM.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Create an IciciATM object
        Account iciciAccount = new Account("IC001", 9500);
        ATM iciciATM = new IciciATM(iciciAccount);

        // Deposit money
        iciciATM.deposit(iciciAccount, 500);
        System.out.println("Account balance after deposit: " + iciciATM.getBalance());

        // Withdraw money
        try {
            boolean success = iciciATM.withdraw(iciciAccount, 8000);
            if (success) {
                System.out.println("Withdrawal successful. Account balance: " + iciciATM.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

