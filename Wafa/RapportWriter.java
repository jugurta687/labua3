import java.util.*;

public interface RapportWriter {
    void genererRapport(List<Statistique> statistiques, String nomFichier);
}