import java.io.*;
import java.util.*;

public class CsvReader {

    public List<String[]> lireCsv(String nomFichier) {
        List<String[]> lignes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;

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