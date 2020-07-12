
import java.util.ArrayList;


public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> result = new ArrayList<>();
        for (Exercise exercise : exercises) {
            result.add(exercise.getName());
        }
        return result;
    }
    
    public void add(String exercise) {
        exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName() == exercise) {
                ex.setCompleted(true);
                break;
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        Boolean result = false;
        for (Exercise ex : exercises) {
            if (ex.getName() == exercise) {
                result = ex.isCompleted();
                break;
            }
        }
        return result;
    }
}
