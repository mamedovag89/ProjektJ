import java.util.Comparator;

public class HumanName <H> implements Comparator<Human>{
    
    @Override
    public int compare(Human human_1, Human human_2) {
        return human_1.getFullName().compareTo(human_2.getFullName());
    }
}
