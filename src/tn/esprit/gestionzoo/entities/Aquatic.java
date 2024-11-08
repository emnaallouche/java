package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + ", family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + ']';
    }

    // Méthode swim() déclarée abstraite
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.name.equals(other.name) && this.age == other.age && this.habitat.equals(other.habitat);
    }
}