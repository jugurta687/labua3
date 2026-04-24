import java.util.*;

public class Main {

    public static void main(String[] args) {

        String nomFichier = "donnees.csv";
        // Lecture du fichier CSV
        CsvReader reader = new CsvReader();
        List<String[]> lignes = reader.lireCsv(nomFichier);

        // Traitement statistique des données
        AnalyseurAbstrait analyseur = new AnalyseurStatistique();
        List<Statistique> statistiques = analyseur.analyser(lignes);

        // Affichage des résultats en console
        System.out.println("Résultats statistiques");
        System.out.println("======================");

        for (Statistique stat : statistiques) {
            System.out.println("Colonne : " + stat.getNomColonne());
            System.out.println("Moyenne : " + stat.getMoyenne());
            System.out.println("Minimum : " + stat.getMinimum());
            System.out.println("Maximum : " + stat.getMaximum());
            System.out.println("----------------------");
        }

        // Exportation du rapport vers un fichier texte
        RapportWriter rapport = new RapportTexteWriter();
        rapport.genererRapport(statistiques, "statistiques.txt");
    }
}
