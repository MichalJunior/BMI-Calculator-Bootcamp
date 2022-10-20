import java.util.HashMap;
import java.util.Random;

public class BmiDB {
    private HashMap<Integer, Float> IMBmap = new HashMap<>();
    BmiCalculator bmiCalculator = new BmiCalculator();

    public void addToDB() {
        IMBmap.put(generateID(), bmiCalculator.getBMI());
    }

    public static int generateID() {
        Random random = new Random();
        return random.nextInt(10000, 100000);

    }

    public void remindBMI(int userID) {
        if (IMBmap.containsKey(userID)) {
            IMBmap.get(userID);
        } else System.out.println("----There is no user or invalid ID----");
    }

}