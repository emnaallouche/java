package tn.esprit.gestionemployee.entities;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<employe, département> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(employe e, département d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé " + e + " est déjà affecté au département " + affectations.get(e));
        } else {
            affectations.put(e, d);
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<employe, département> entry : affectations.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + ", Département: " + entry.getValue());
        }
    }

    public void supprimerEmploye(employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(employe e, département d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés:");
        for (employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements:");
        for (département d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(département d) {
        return affectations.containsValue(d);
    }

    public TreeMap<employe, département> trierMap() {
        return new TreeMap<>(affectations);
    }
}