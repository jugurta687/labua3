import java.util.*;

public abstract class AnalyseurAbstrait {

    public abstract List<Statistique> analyser(List<String[]> lignes);

    protected boolean estNombre(String valeur) {
        try {
            Double.parseDouble(valeur);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}