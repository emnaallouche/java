package tn.esprit.gestionemployee.main;
import tn.esprit.gestionemployee.entities.*;

public class empmain {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        employe e1 = new employe(5, "farah", "Ahmed", "IT", 5);
        employe e2 = new employe(8, "mariem", "Zouari", "HR", 4);
        employe e3 = new employe(1, "emna", "Moussa", "Finance", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés:");
        societe.displayEmploye();

        societe.trierEmployeParId();
        System.out.println("Après tri par ID:");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("Après tri par nom, département et grade:");
        societe.displayEmploye();

        System.out.println("Recherche de l'employé emna': " + societe.rechercherEmploye("emna"));
    }
}