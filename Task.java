import java.util.ArrayList;

public class Task {
    String nazevUkolu;
    String popisUkolu;
    Boolean splneno;

    Task(String nazevUkolu, String popisUkolu, Boolean splneno){
        this.nazevUkolu = nazevUkolu;
        this.popisUkolu = popisUkolu;
        this.splneno = splneno;
    }

    static void vypisUkolu(ArrayList<Task>tasks){
        for (Task task : tasks){
            System.out.println(task.nazevUkolu);
            System.out.println(task.popisUkolu);
            System.out.println(task.splneno);
            System.out.println();
        }
    }
}
