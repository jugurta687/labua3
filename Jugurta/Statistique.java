//Classe représentant les indicateurs statistiques calculés pour une colonne donnée
public class Statistique {
    private String nomColonne;
    private double moyenne;
    private double minimum;
    private double maximum;

    // Constructeur pour initialiser les indicateurs calculés
    public Statistique(String nomColonne, double moyenne, double minimum, double maximum) {
        this.nomColonne = nomColonne;
        this.moyenne = moyenne;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    // Getters permettant l'accès aux données par les autres classes
    public String getNomColonne() {
        return nomColonne;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }
}
