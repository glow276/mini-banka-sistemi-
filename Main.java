import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hesap sahibinin adını giriniz: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);

        int choice;

        do {
            System.out.println("\n--- Mini Banka Sistemi ---");
            System.out.println("1- Bakiye Görüntüle");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mevcut Bakiye: " + account.getBalance() + " TL");
                    break;

                case 2:
                    System.out.print("Yatırılacak tutar: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Çekilecek tutar: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim!");
            }

        } while (choice != 4);

        scanner.close();
    }
}

