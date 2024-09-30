 class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
         this.family = family;
         this.name = name;
         this.age = age;
         this.isMammal = isMammal;
     }
     void displayAnimal() {
         System.out.println("Animal: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal);
 }
     @Override
     public String toString() {
         return "Animal{" +
                 "family='" + family + '\'' +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 ", isMammal=" + isMammal +
                 '}';
     }}
