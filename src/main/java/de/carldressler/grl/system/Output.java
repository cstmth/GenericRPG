package de.carldressler.grl.system;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Output {

    // TODO: Implement working delay between characters
    public static void print(String message) {
        System.out.println(message);
    }

    public static String askText(String question) {
        Scanner in = new Scanner(System.in);

        System.out.print("TEXT | " + question + ": ");
        return in.nextLine();
    }

    public static boolean askBoolean(String question) {
        Scanner in = new Scanner(System.in);
        List<String> yesValues = List.of("yes", "ja", "y", "j");
        List<String> noValues = List.of("no", "nein", "n");

        while (true) {
            System.out.print("YES/NO | " + question + ": ");
            String answer = in.nextLine().strip().toLowerCase();

            if (yesValues.contains(answer))
                return true;
            else if (noValues.contains(answer))
                return false;
        }
    }
}
