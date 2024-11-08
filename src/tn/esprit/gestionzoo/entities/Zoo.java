package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages = 3;
    private int animalCount = 0;
    private int nbrAnimals = 0;
    private int nbrAquatic = 0;
    private Aquatic aquaticAnimals[];



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

    public int getnbrCages() {
        return nbrCages;
    }

    public void setnbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }
    public void setAnimalCount(int animalCount) {
       this.animalCount=animalCount;
    }
    public int getAnimalCount() {
        return animalCount;
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
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if (nbrAquatic>10) {
            System.out.println("max 10 animal aquatic.");
        }
        else{
        aquaticAnimals[nbrAquatic] = aquatic;
        nbrAquatic++;

    }
    }



    public void addAnimal(Animal animal) throws InvalidAgeException {
        // Vérification de l'âge de l'animal
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif : " + animal.getAge());
        }

        // Ajouter l'animal si l'âge est valide
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            System.out.println("L'animal " + animal.getName() + " a été ajouté au zoo.");
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter un autre animal.");
        }
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
        return nbrAnimals >= nbrCages;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }
    public void displayAquaticSwims() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins: " + dolphinCount);
        System.out.println("Nombre de pingouins: " + penguinCount);
    }
}