
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("x", "y", false));
        tasks.add(new Task("z", "n", false));
        tasks.add(new Task("www", "yxyxyxy", true));
        Task.vypisUkolu(tasks);
    }
}