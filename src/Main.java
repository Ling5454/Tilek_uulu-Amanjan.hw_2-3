import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);

        try {
            while (true) {
                account.withDraw(6000.0);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount() + " сом");
            }
        } catch (LimitException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
            System.out.println("Снято " + e.getRemainingAmount() + " сом. Остаток на счете: 0 сом");
        }
    }
}
