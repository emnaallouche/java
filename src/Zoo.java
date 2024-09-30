import java.util.ArrayList;

class Zoo {
    Animal [] animals;
    String name;
    String city;
    int NBR_CAGES;
    int nbrAnimals=0;

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
