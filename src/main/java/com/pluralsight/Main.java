package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// STRINGS LOOP BRYANS EXAMPLE------------------------------------------------
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String scoreText = scanner.nextLine();

        String[] firstSplit = scoreText.split("\\|");
        String[] teamNames = firstSplit[0].split(":");
        String[] teamScores = firstSplit[1].split(":");
        if (Integer.parseInt(teamScores[0]) > Integer.parseInt(teamScores[1])) {
            System.out.println("Winner: " + teamNames[0]);
        } else {
            System.out.println("Winner: " + teamNames[1]);
        }

        //-----------------------------------------------------------------------------------
// ANOTHER WAY TO DO THIS:-----------------------------------------------------------
    /*
    String Winner;

    System.out.println("Please enter game info/score: ");
    System.out.println("Home team: ");
            String Home = scanner.nextLine();

    System.out.println("Visitor Team: ");
            String Visitor = scanner.nextLine();

    System.out.println("Home Team Points: ");
            int homeScore1 = scanner.nextInt();

    System.out.println("Visitor Team Points: ");
            int visitorScore1 = scanner.nextInt();

    if(homeScore1 >visitorScore1)

            {
                Winner = Home;
            } else if(visitorScore1 >homeScore1)

            {
                Winner = Visitor;
            } else

            {
                Winner = "Draw";
            }
    System.out.println("Winner: "+Winner); */

    }
}