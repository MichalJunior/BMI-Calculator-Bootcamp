import java.util.Scanner;

public class BmiCalculator {




    private float BMI;
    private final Scanner scanner = new Scanner(System.in);

    public int takeWeightFromUser() {

        System.out.print("Podaj wagę w [kg]:");
        return scanner.nextInt();
    }

    public float takeHeightFromUser() {
        System.out.print("podaj wysokość w [m]:");
        return scanner.nextFloat();
    }

    public void showBMI() {
        System.out.println("Twoje BMI to: " + countBMI());

    }


    private float countBMI() {
        int weight = takeWeightFromUser();
        float height = takeHeightFromUser();
        float bmi = weight / (height * height);
        setBMI(bmi);
        return bmi;

    }

    public void setBMI(float BMI) {
        this.BMI = BMI;
    }

    public float getBMI() {
        return BMI;
    }
}
