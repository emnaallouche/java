import java.util.Scanner;

class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrCages ;
        String zooName ;
        System.out.printf("Entrez le nom du zoo ");
        zooName = scanner.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();
        System.out.printf("%s comporte %d cages%n", zooName, nbrCages);
        scanner.close();
    }
}