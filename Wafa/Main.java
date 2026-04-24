import java.util.*;

public class Main {

    public static void main(String[] args) {

        String nomFichier = "donnees.csv";

        CsvReader reader = new CsvReader();
        List<String[]> lignes = reader.lireCsv(nomFichier);

        AnalyseurAbstrait analyseur = new AnalyseurStatistique();
        List<Statistique> statistiques = analyseur.analyser(lignes);

        System.out.println("Résultats statistiques");
        System.out.println("======================");

        for (Statistique stat : statistiques) {
            System.out.println("Colonne : " + stat.getNomColonne());
            System.out.println("Moyenne : " + stat.getMoyenne());
            System.out.println("Minimum : " + stat.getMinimum());
            System.out.println("Maximum : " + stat.getMaximum());
            System.out.println("----------------------");
        }

        RapportWriter rapport = new RapportTexteWriter();
        rapport.genererRapport(statistiques, "statistiques.txt");
    }
}