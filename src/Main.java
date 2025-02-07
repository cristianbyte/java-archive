public class Main {
    public static void main(String[] args) {
        // Literal String = ( string text = new string("howdy"))
        String text = "Welcome to JavaBank ATM";
        System.out.println(text);

        Account myAccount = new Account("123456789", 1000.0);
        myAccount.deposit(500.0);

        try {
            myAccount.withdraw(200.0);
        } catch (Exception e) {
            System.out.println("Error: Fondos insuficientes");
        }

        System.out.println("Saldo final: $" + myAccount.getBalance());


    }
}
