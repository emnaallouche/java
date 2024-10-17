package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int NBR_CAGES;
    private int nbrAnimals = 0;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public void setNBR_CAGES(int NBR_CAGES) {
        this.NBR_CAGES = NBR_CAGES;
        this.animals = new Animal[NBR_CAGES];
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Cannot add animal. The zoo is full.");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimal();
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removerAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                nbrAnimals--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + NBR_CAGES);
    }
}