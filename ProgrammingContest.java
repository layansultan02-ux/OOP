package edu.zuj.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammingContest extends Contest {

    private String Language;
    private int NumOfProblems;
    private ArrayList<Team> Teams;

    public ProgrammingContest() {
        super();
        this.Language = "java";
        this.NumOfProblems = 3;
        this.Teams = new ArrayList<Team>();
    }

    public ProgrammingContest(String name, char level, String location, 
                              String language, int numOfProblems, 
                              int teamId, String teamName, int teamMembers) {
        super(name, level, location);
        setLanguage(language);
        setNumOfProblems(numOfProblems);
        this.Teams = new ArrayList<Team>();
        addTeam(teamId, teamName, teamMembers);
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        String LangLower = Language.toLowerCase();
        if (LangLower.equals("java") || LangLower.equals("python") || LangLower.equals("c++")) {
            this.Language = Language;
        } else {
            this.Language = "java";
        }
    }

    public int getNumOfProblems() {
        return NumOfProblems;
    }

    public void setNumOfProblems(int NumOfProblems) {
        if (NumOfProblems >= 3) {
            this.NumOfProblems = NumOfProblems;
        } else {
            this.NumOfProblems = 3;
        }
    }

    public ArrayList<Team> getTeams() {
        return Teams;
    }

    public void setTeams(ArrayList<Team> Teams) {
        this.Teams = Teams;
    }

    public void addTeam() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Team ID (must start with 1): ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team Name (max 10 chars, must start with @): ");
        String Name = scanner.nextLine();

        System.out.println("Enter number of team members (3-5): ");
        int Members = scanner.nextInt();

        Team team = new Team(ID, Name, Members);
        Teams.add(team);
        System.out.println("Team added successfully!");

    }

    public void addTeam(int ID, String Name, int Members) {
        Team team = new Team(ID, Name, Members);
        Teams.add(team);
    }

    public double RegFee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Does the team consist of students? (yes/no): ");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            double parentFee = super.RegFee();
            return parentFee - 10;
        } else {
            return 100;
        }
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";
        result = result + "Programming Contest Data:\n";
        result = result + "Language: " + Language + "\n";
        result = result + "Number of Problems: " + NumOfProblems + "\n";
        result = result + "Number of Teams: " + Teams.size() + "\n";

        if (!Teams.isEmpty()) {
            result = result + "Teams List:\n";
            for (Team team : Teams) {
                result = result + team.getTeamInfo() + "\n";
            }
        }

        return result;
    }
}
