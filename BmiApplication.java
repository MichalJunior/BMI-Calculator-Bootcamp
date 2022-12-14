import java.util.Scanner;

public class BmiApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiCalculator bmiCalculator = new BmiCalculator();
        BmiDB bmiDB = new BmiDB();

        while (true) {
            GUI.showMenu();
            switch (scanner.nextInt()) {
                case 1 -> {
                    bmiCalculator.printBMI();
                    bmiDB.addToDB();
                    bmiDB.printID();
                    System.out.println(bmiCalculator.judgeBMI());
                }
                case 2 -> {
                    System.out.print("Insert your ID:");
                    bmiDB.remindBMI(scanner.nextInt());

                }
                case 3 -> System.exit(0);
                default -> System.out.println("---Wrong credential---");
            }
            System.out.println("------------------");
        }
    }
}
