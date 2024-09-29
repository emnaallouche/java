import java.util.Scanner;

class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("family","lionn",30,true);
        Zoo myZoo = new Zoo("belvidaire", "tunis",25);
        lion.displayAnimal();
        myZoo.displayZoo();
        myZoo.animals[0] = lion;
        System.out.println(myZoo);
    }
}