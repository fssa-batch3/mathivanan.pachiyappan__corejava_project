package Day05.practice;

class IciciATM implements ATM {
    private static final double withdrawal_charge = 10.0;

    private Account account;
    
    public IciciATM(Account account) {
        this.account = account;
    }

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 10000) {
            throw new Exception("Insufficient balance. Minimum balance required: 10000");
        }

        double totalAmount = amount + withdrawal_charge;
        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            return true;
        }

        return false;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }
}

