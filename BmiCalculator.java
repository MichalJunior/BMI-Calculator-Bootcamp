import java.util.Scanner;

public class BmiCalculator {
    private static float BMI;
    private final Scanner scanner = new Scanner(System.in);

    public void printBMI() {
        System.out.println("Your BMI : " + countBMI());

    }

    private float countBMI() {
        int weight = takeWeightFromUser();
        float height = takeHeightFromUser();
        float bmi = weight / (height * height);
        setBMI(bmi);
        return bmi;

    }

    public int takeWeightFromUser() {

        System.out.print("Insert your weight[kg]: ");
        return scanner.nextInt();
    }

    public float takeHeightFromUser() {
        System.out.print("Insert yout Heigh[m]: ");
        return scanner.nextFloat();
    }

    public void setBMI(float BMI) {
        BmiCalculator.BMI = BMI;
    }

    public  static float getBMI() {
        return BMI;
    }
}
