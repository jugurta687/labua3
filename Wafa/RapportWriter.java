import java.util.*;

//Interface définissant le contrat pour la génération de rapports
public interface RapportWriter {
    void genererRapport(List<Statistique> statistiques, String nomFichier);
}
