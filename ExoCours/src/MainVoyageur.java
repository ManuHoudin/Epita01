import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

class MainVoyageur {



    public static void main(String[] args) {

        ArrayList<Voyageur> listeVoyageur = new ArrayList<>();
        Voyageur voyageur1 = new Voyageur(01,2, "Tatoo", "Economique");
        Voyageur voyageur2 = new Voyageur(02,58, "Liverty", "Première");
        Voyageur voyageur3 = new Voyageur(03,20, "Baloo", "Business");


        listeVoyageur.add(voyageur1);
        listeVoyageur.add(voyageur2);
        listeVoyageur.add(voyageur3);

        System.out.println(listeVoyageur);

    }
}
