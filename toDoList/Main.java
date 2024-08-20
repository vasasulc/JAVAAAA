package toDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // vytvoření listu s úkolama
        ArrayList<Task> tasks = new ArrayList<>();

        // přidání úkolů
        tasks.add(new Task("Uklidit pokoj", false));
        tasks.add(new Task("Nakoupit jídlo", false));
        tasks.add(new Task("dodělat program", true));

        // vytvoření scanneru
        Scanner scanner = new Scanner(System.in);

        // výběr akce
        System.out.println("Pro přidání úkolu napište: \"Přidat\"");
        System.out.println("Pro přidání úkolu napište: \"Splnit\"");

        // sken inputu
        String Input = scanner.nextLine();

        // provedení akce, kterou si uživatel vybral
        if (Input.equals("Přidat")) {

            System.out.println("Název úkolu:");
            String nazevUkolu = scanner.nextLine();
            tasks.add(new Task(nazevUkolu, false));

        } else if (Input.equals("Splnit")) {

            System.out.print("Jaký úkol si splnil?");
            Task.vypisUkolu(tasks);
            String nazevUkolu = scanner.nextLine();
            Boolean ukolNalezen = false;

            for (Task task : tasks) {
                if (nazevUkolu.equals(task.nazevUkolu) && task.splneno.equals(false)) {
                    task.splneno = true;
                    System.out.println("Úkol " + nazevUkolu + " byl označen jako splněný");
                    ukolNalezen = true;
                    break;
                } else if (nazevUkolu.equals(task.nazevUkolu) && task.splneno.equals(true)) {
                    System.out.println("Úkol " + nazevUkolu + " už je splněn");
                    ukolNalezen = true;
                    break;
                }
            }

            if (!ukolNalezen) {
                System.out.println("Úkol není na seznamu");
            }
 
        }
        // výpis všech úkolů
        Task.vypisUkolu(tasks);
    }
}