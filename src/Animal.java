 class Animal {
    protected String family;
     protected String name;
     protected int age;
     protected boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
         this.family = family;
         this.name = name;
         this.age = age;
         this.isMammal = isMammal;
     }
     public String setFamily(String family) {
        this.family = family;

     }
     public String setName(String name) {
        this.name = name;
     }
     public String setAge(int age) {
        this.age = age;
     }
     public String setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
     }
     public String getFamily() {
        return family;
     }
     public String getName() {
        return name;
     }
     public int getAge() {
        return age;
     }
     public boolean isMammal() {
        return isMammal;
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
