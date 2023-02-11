package cards;

import java.io.Console;

public class Main {
    public static void main(String args[]) {
        Deck d = new Deck();
        System.out.println("cards remaining: " + d.getDeckSize());
        Console cons = System.console();

        while (true) {
            // no more cards, exit program
            if (d.getDeckSize() < 1) {
                System.out.println("no more cards !");
                break;
            }
            
            // ask user for input shuffle or take
            String s = cons.readLine("Would you like to shuffle or take cards?");
            
            // ensure user input is not empty
            if (s.isEmpty()) {
                System.out.println("input required");
                continue;
            }
            
            // carry out action if input[0] is shuffle or take
            String[] input = s.trim().toLowerCase().split("[ ,]+");
            if(input[0].equals("shuffle")){
                d.shuffle();
                System.out.println("deck shuffled");
            } else if (input[0].equals("take") && input.length == 1) {
                System.out.println(d.take());
            } else if (input[0].equals("take") && input.length == 2) {
                int times = Integer.parseInt(input[1]);
                for (int i = 0; i < times; i++) {
                    System.out.println(d.take());
                }
            } else {
                System.out.println("invalid action");
            }
            System.out.println("cards remaining: " + d.getDeckSize());
         }
    }
}
