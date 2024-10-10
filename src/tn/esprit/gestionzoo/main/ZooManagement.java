package tn.esprit.gestionzoo.main;

class ZooManagement
{
    public static void main(String[] args) {
        Animal lion0 = new Animal("family","lion0",30,true);
        Animal lion1 = new Animal("family","lion1",30,true);
        Animal lion = new Animal("family","lion",30,true);


        Zoo myZoo = new Zoo("belvidaire", "tunis");
        myZoo.addAnimal(lion0);
        myZoo.addAnimal(lion1);
        myZoo.addAnimal(lion);

        myZoo.displayZoo();

        int index = myZoo.searchAnimal(lion);
        System.out.println("Index de l'animal 'Lion': " + index);
        Animal tiger = new Animal("Felidae", "Tiger", 5, true);
        int indexTiger = myZoo.searchAnimal(tiger);
        System.out.println("Index de l'animal 'Tiger': " + indexTiger);
        System.out.println(myZoo);
    }
}