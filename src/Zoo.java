import java.util.ArrayList;

class Zoo {
    protected Animal [] animals;
    protected String name;
    protected String city;
    protected int NBR_CAGES;
    protected int nbrAnimals=0;

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
        if (name.isEmpty())
        {
            System.out.println("Name cannot be empty");
        }
        else {
            this.name = name;
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
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[ NBR_CAGES];
    }

    boolean addAnimal(Animal animal)
    {
        this.animals[NBR_CAGES] = animal;
        nbrAnimals++;
        return true;

    }
    void displayAnimals(){
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }
    boolean removerAnimal(Animal animal)
    {
        for (int i = 0; i < nbrAnimals; i++)
        {
            if (animals[i].name.equals(animal.name))
            {
                animals[i] = null;
                nbrAnimals-- ;
                return true ;
            }

        }
        return false ;
    }
    boolean isZooFull() {
        return nbrAnimals <= NBR_CAGES;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2)
    { if(z1.nbrAnimals > z2.nbrAnimals){
        return z1;}
        return z2;

    }
    void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " +  NBR_CAGES);
    }
}
