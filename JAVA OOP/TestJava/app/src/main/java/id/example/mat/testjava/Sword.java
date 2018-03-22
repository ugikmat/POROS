package id.example.mat.testjava;

/**
 * Created by mat on 3/19/18.
 */

public abstract class Sword implements Weapon {
    private double weight;
    private double sharpness;

    public String attack() {
        return "Sriiingg";
    }

    public String attack(String sfx){
        return sfx;
    }

    public Sword(double weight, double sharpness) {
        this.weight = weight;
        this.sharpness = sharpness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSharpness() {
        return sharpness;
    }

    public void setSharpness(double sharpness) {
        this.sharpness = sharpness;
    }


}
