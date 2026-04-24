import java.util.*;
//Classe abstraite définissant la structure de base pour tout type d'analyseur
public abstract class AnalyseurAbstrait {

    // Méthode abstraite que les sous-classes herite
    public abstract List<Statistique> analyser(List<String[]> lignes);

    // Méthode utilitaire pour vérifier si une chaîne de caractères peut être convertie en nombre
    protected boolean estNombre(String valeur) {
        try {
            Double.parseDouble(valeur);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
