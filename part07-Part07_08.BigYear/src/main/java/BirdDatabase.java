
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }

    public Bird findBird(String name) {
        Bird foundBird = null;
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                foundBird = bird;
                break;
            }
        }
        return foundBird;
    }
    
    public void add(Bird newBird) {
        birds.add(newBird);
    }
    
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
}
