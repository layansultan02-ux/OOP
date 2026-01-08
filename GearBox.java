
package edu.zuj.oop;

public class GearBox {
    private int shifts;
    private boolean automatic;

    public GearBox() {
    }

    public GearBox(int shifts, boolean automatic) {
        this.shifts = shifts;
        this.automatic = automatic;
    }

    public int getShifts() {
        return shifts;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "GearBox{" + "shifts=" + shifts + ", automatic=" + automatic + '}';
    }

   public void turnOn(){
        System.out.println("Turning on gearbox");
    }

    public void turnOff(){
        System.out.println("Turning off gearbox");
    }
    
    
}
