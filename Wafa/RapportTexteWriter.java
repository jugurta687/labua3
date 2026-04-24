import java.io.*;
import java.util.*;

public class RapportTexteWriter implements RapportWriter {

    @Override
    public void genererRapport(List<Statistique> statistiques, String nomFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {

            writer.println("Rapport statistique");
            writer.println("====================");

            for (Statistique stat : statistiques) {
                writer.println("Colonne : " + stat.getNomColonne());
                writer.println("Moyenne : " + stat.getMoyenne());
                writer.println("Minimum : " + stat.getMinimum());
                writer.println("Maximum : " + stat.getMaximum());
                writer.println("--------------------");
            }

            System.out.println("Rapport généré avec succès : " + nomFichier);

        } catch (IOException e) {
            System.out.println("Erreur lors de la création du rapport.");
        }
    }
}