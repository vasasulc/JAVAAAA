package toDoList;

import java.util.ArrayList;

public class Task {
    String nazevUkolu;
    Boolean splneno;

    Task(String nazevUkolu,Boolean splneno){
        this.nazevUkolu = nazevUkolu;
        this.splneno = splneno;
    }

    static void vypisUkolu(ArrayList<Task>tasks){

        System.out.println();
        System.out.println("Úkoly:");
        System.out.println();

        for (Task task : tasks){
            System.out.println("Úkol: "+task.nazevUkolu);
            System.out.print("Splněn: ");
            System.out.println(task.splneno.equals(true) ? "Ano" : "Ne");
            System.out.println();
        }
    }
}
