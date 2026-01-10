package edu.zuj.oop;

public class Contest {

    private String Name;
    private char Level;
    private String Location;

    public Contest() {
        Name = "General";
        Level = 'A';
        Location = "Not defines";
    }

    public Contest(String Name, char Level, String Location) {
        this.Name = Name;
        this.Level = Level;
        this.Location = Location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name.toUpperCase();
    }

    public char getLevel() {
        return Level;
    }

    public void setLevel(char Level) {
        char upperLevel = Character.toUpperCase(Level);
        if (upperLevel == 'A' || upperLevel == 'B' || upperLevel == 'C') {
            this.Level = upperLevel;
        } else {
            this.Level = 'A';
        }
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public double RegFee() {
        double fee = 0;
        String loc = Location.toLowerCase();
        switch (Level) {
            case 'A':
                if (loc.equals("amman")) {
                    fee = 40;
                } else if (loc.equals("irbid")) {
                    fee = 20;
                }
                break;
                case 'B':
                if (loc.equals("amman")) {
                    fee = 50;
                } else if (loc.equals("irbid")) {
                    fee = 25;
                }
                break;
                case 'C':
                if (loc.equals("amman")) {
                    fee = 70;
                } else if (loc.equals("irbid")) {
                    fee = 35;
                }
                break;
           }
        return fee;
    }
@Override
    public String toString() {
        return "Contest Data:\n" +
               "Name: " + Name + "\n" +
               "Level: " + Level + "\n" +
               "Location: " + Location + "\n" +
               "Registration Fee: " + RegFee();
    }

}
