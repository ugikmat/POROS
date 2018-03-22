package id.example.mat.testjava;

/**
 * Created by mat on 3/19/18.
 */

public class Rapier extends Sword {

    public Rapier(double weight, double sharpness) {
        super(weight, sharpness);
    }

    @Override
    public String attack() {
        return "Vzzzt";
    }
}
