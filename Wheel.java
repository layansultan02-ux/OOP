
package edu.zuj.oop;

public class Wheel {
     private Tyre tyre;
    private Rim rim;

    public Wheel() {
    }

    public Wheel(Tyre tyre, Rim rim) {
        this.tyre = tyre;
        this.rim = rim;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Rim getRim() {
        return rim;
    }

    public void setRim(Rim rim) {
        this.rim = rim;
    }

    @Override
    public String toString() {
        return "Wheel{" + "tyre=" + tyre + ", rim=" + rim + '}';
    }
    
}
