import java.util.ArrayList;

public class Voyageur {

    int numVoayageur;
    int numSiège;
    String nom;
    String classe;



    public Voyageur(int numVoayageur, int numSiège, String nom, String classe) {
        this.numVoayageur = numVoayageur;
        this.numSiège = numSiège;
        this.nom = nom;
        this.classe = classe;
    }

    public int getNumVoayageur() {
        return numVoayageur;
    }

    public int getNumSiège() {
        return numSiège;
    }

    public String getNom() {
        return nom;
    }

    public String getClasse() {
        return classe;
    }
}
