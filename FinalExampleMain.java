package edu.zuj.oop;

import java.util.Scanner;

public class FinalExampleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Creating Programming Contest ===");

        ProgrammingContest contest = new ProgrammingContest(
                "AI Challenge", 'A', "amman",
                "python", 5,
                101, "@AI_Team", 4
        );

        System.out.println("Programming Contest created successfully!");
        System.out.println(contest.toString());

        fillFourTeams(contest);

        searchTeamsByMembers(contest);

        System.out.println("\n=== Calculating Registration Fee ===");
        double fee = contest.RegFee();
        System.out.println("Registration Fee: " + fee);
    }

    public static void fillFourTeams(ProgrammingContest contest) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Enter data for 4 teams ===");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\nTeam " + i + ":");
            contest.addTeam();
        }
    }

    public static void searchTeamsByMembers(ProgrammingContest contest) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of members to search for: ");
        int searchMembers = scanner.nextInt();

        System.out.println("\nTeams with " + searchMembers + " or fewer members:");
        boolean found = false;

        for (Team team : contest.getTeams()) {
            if (team.getMembers() <= searchMembers) {
                System.out.println(team.getTeamInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No teams found with " + searchMembers + " or fewer members.");
        }
    }
}
