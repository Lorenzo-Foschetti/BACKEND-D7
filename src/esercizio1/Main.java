package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int numeroParole = Integer.parseInt(scanner.nextLine());
        Set<String> duplicati = new HashSet<>();
        Set<String> senzaDuplicati = new HashSet<>();

        for (int i = 0; i < numeroParole; i++) {
            System.out.println("Quali parole vuoi inserire?");
            String text = scanner.nextLine();
            if (senzaDuplicati.add(text)) {
                senzaDuplicati.add(text);
            } else {
                duplicati.add(text);
            }

        }
        System.out.println(senzaDuplicati);
        System.out.println(senzaDuplicati.size());
        System.out.println(duplicati);
    }
}
