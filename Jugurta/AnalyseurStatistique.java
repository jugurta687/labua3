import java.util.*;

public class AnalyseurStatistique extends AnalyseurAbstrait {

    @Override
    public List<Statistique> analyser(List<String[]> lignes) {
        List<Statistique> statistiques = new ArrayList<>();

        // Vérification de sécurité, si la liste est vide ou nulle
        if (lignes == null || lignes.isEmpty()) {
            System.out.println("Le fichier est vide.");
            return statistiques;
        }

        String[] entetes = lignes.get(0);
        int nombreColonnes = entetes.length;

        // Boucle principale, itération sur chaque colonne
        for (int col = 0; col < nombreColonnes; col++) {
            double somme = 0;
            double minimum = Double.MAX_VALUE;
            double maximum = -Double.MAX_VALUE;
            int compteur = 0;

            // Parcours des lignes de données (en ignorant l'en-tête à l'index 0)
            for (int i = 1; i < lignes.size(); i++) {
                String[] ligne = lignes.get(i);

                if (col < ligne.length) {
                    String valeur = ligne[col].trim();

                    // Utilisation de la méthode héritée pour valider le format numérique
                    if (estNombre(valeur)) {
                        double nombre = Double.parseDouble(valeur);

                        somme += nombre;
                        minimum = Math.min(minimum, nombre);
                        maximum = Math.max(maximum, nombre);
                        compteur++;
                    }
                }
            }

            // Si au moins une valeur numérique a été trouvée, on crée l'objet Statistique
            if (compteur > 0) {
                double moyenne = somme / compteur;

                Statistique stat = new Statistique(
                        entetes[col],
                        moyenne,
                        minimum,
                        maximum
                );

                statistiques.add(stat);
            }
        }

        return statistiques;
    }
}
