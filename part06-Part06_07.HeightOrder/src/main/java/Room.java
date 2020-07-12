
import java.util.ArrayList;

public class Room {
   
    ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }
   
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        Person result = null;
        for (Person person : persons) {
            if (result == null || person.getHeight() < result.getHeight()) {
                result = person;
            }
        }
        return result;
    }
    
    public Person take() {
        Person shortest = shortest();
        if (shortest != null) {
            persons.remove(shortest);
        }
        return shortest;
    }
    
}
