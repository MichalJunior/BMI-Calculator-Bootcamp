import java.util.HashMap;
import java.util.Random;

public class BmiDB {
    private HashMap<Integer, Float> IMBmap = new HashMap<>();

    private int ID;

    public void addToDB() {
        IMBmap.put(generateID(), BmiCalculator.getBMI());
    }

    public int generateID() {
        Random random = new Random();
        int id = random.nextInt(10000, 100000);
        setID(id);
        return id;


    }

    public void remindBMI(int userID) {
        if (IMBmap.containsKey(userID)) {
            System.out.println(IMBmap.get(userID));
        } else System.out.println("----There is no user or invalid ID----");
    }

    public void printID() {
        System.out.println("Your ID: " + ID);
    }


    public void setID(int ID) {
        this.ID = ID;
    }
}