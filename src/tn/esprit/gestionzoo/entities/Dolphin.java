package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    public float swimming_speed;
   public Dolphin (String family, String name, int age,boolean isMammal ,String habitat , float Swimming_speed)
    {
        super(family, name, age, isMammal, habitat);
        this.swimming_speed = Swimming_speed;
    }

    @Override
    public String toString() {
        return "Dolphin{" + "habitat=" + habitat + ", swimming speed=" + swimming_speed + ", family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + '}';
    }



}

