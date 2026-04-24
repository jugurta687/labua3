import java.io.*;
import java.util.*;

public class CsvReader {

    // Lit un fichier CSV et retourne une liste de tableaux
    public List<String[]> lireCsv(String nomFichier) {
        List<String[]> lignes = new ArrayList<>();

        // Utilisation de BufferedReader pour une lecture efficace et sécurisée
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;

            // Lecture séquentielle du fichier jusqu'à la fin
            while ((ligne = br.readLine()) != null) {
                String[] colonnes = ligne.split(",");
                lignes.add(colonnes);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : fichier introuvable.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier.");
        }

        return lignes;
    }
}
