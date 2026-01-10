package edu.zuj.oop;

public class Team {

    private int ID;
    private String Name;
    private int Members;

    public Team() {
        this.ID = 11;
        this.Name = "Not defined";
        this.Members = 3;
    }

    public Team(int ID, String Name, int Members) {
        this.ID = ID;
        this.Name = Name;
        this.Members = Members;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        String idStr = String.valueOf(ID);
        if (ID != 0 && idStr.startsWith("1")) {
            this.ID = ID;
        } else {
            this.ID = 11;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (Name != null && Name.length() <= 10 && Name.startsWith("@")) {
            this.Name = Name;
        } else {
            this.Name = "@NotDefined";
        }
    }

    public int getMembers() {
        return Members;
    }

    public void setMembers(int Members) {
        if (Members >= 3 && Members <= 5) {
            this.Members = Members;
        } else {
            this.Members = 3;
        }
    }

    public String getTeamInfo() {
        return "TeamID: " + ID + " ***** Team Name: " + Name + " ***** Team Members: " + Members;
    }

    @Override
    public String toString() {
        return getTeamInfo();
    }

}
