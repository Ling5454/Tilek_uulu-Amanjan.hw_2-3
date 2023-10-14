public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Положено " + sum + " сом на счет. Остаток: " + amount + " сом.");
        } else {
            System.out.println("Сумма для пополнения должна быть больше нуля.");
        }
    }

    public void withdraw(double sum) throws LimitException {
        if (sum <= amount) {
            amount -= sum;
            System.out.println("Снято " + sum + " сом со счета. Остаток: " + amount + " сом.");
        } else {
            throw new LimitException("Недостаточно средств на счете", amount);
        }
    }
}