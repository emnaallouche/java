package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

class ZooManagement
{
    public static void main(String[] args) {
        Animal lion0 = new Animal("family","lion0",30,true);
        Animal lion1 = new Animal("family","lion1",30,true);
        Animal lion = new Animal("family","lion",30,true);
        Animal simba = new Animal("family","lion8",30,true);
        Zoo myZoo = new Zoo("belvidaire", "tunis");
        myZoo.displayZoo();
        Animal tiger = new Animal("Felidae", "Tiger", 5, true);
        try {
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux dans le zoo: " + myZoo.getAnimalCount());
            myZoo.addAnimal(lion0);
            System.out.println("Nombre d'animaux dans le zoo: " + myZoo.getAnimalCount());
            myZoo.addAnimal(tiger);
            System.out.println("Nombre d'animaux dans le zoo: " + myZoo.getAnimalCount());
            myZoo.addAnimal(simba);
            System.out.println("Nombre d'animaux dans le zoo: " + myZoo.getAnimalCount());
        } catch (InvalidAgeException  e){
            System.out.println(e.getMessage()); // Afficher le message de l'exception
        }/*
        int index = myZoo.searchAnimal(lion);
        System.out.println("Index de l'animal 'Lion': " + index);

        int indexTiger = myZoo.searchAnimal(tiger);
        System.out.println("Index de l'animal 'Tiger': " + indexTiger);
        System.out.println(myZoo);*/

        Animal animal = new Animal("mer","simba",2,true);
        Terrestrial terrestrial = new Terrestrial("mer","simba",2,true,4);
        Dolphin dolphin = new Dolphin("mer","simba",2,true,"mer",80);
        Penguin penguin = new Penguin("mer","simba",2,true,"glace",10);


        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.displayAquaticSwims(); // Affiche les nages des animaux aquatiques
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(animal);
        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        //+aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}