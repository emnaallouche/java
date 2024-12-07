package tn.esprit.gestionemployee.entities;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public abstract class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        students.forEach(con);
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        // Filtre les étudiants avec le prédicat 'pre' et applique l'action 'con' sur ceux qui passent le filtre
        students.stream().filter(pre).forEach(con);
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        // Utilise la fonction 'fun' pour obtenir le nom de chaque étudiant et les concatène dans une seule chaîne
        StringBuilder names = new StringBuilder();
        for (Etudiant etudiant : students) {
            names.append(fun.apply(etudiant)).append(", ");
        }
        return names.toString();
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        // Crée et retourne un étudiant en utilisant le fournisseur 'sup'
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        // Trie les étudiants en utilisant le comparateur 'com' et retourne la liste triée
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return Stream.empty();
    }
}
