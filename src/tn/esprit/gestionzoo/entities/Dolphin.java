package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    public float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println(name + " the dolphin swims at a speed of " + swimmingSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "habitat=" + habitat +
                ", swimmingSpeed=" + swimmingSpeed +
                ", family=" + family +
                ", name=" + name +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    @Override
    public void eatMeat(Aquatic meat) {

    }
}