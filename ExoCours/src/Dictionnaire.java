import java.net.SocketOption;

public class Dictionnaire {

    String titre;
    static boolean alreadyExist = false;

    public Dictionnaire(String titre) {
        this.titre = titre;
    }

    public static void main(String[] args) {
        if(alreadyExist) {
            System.out.println("Impossible de créer un autre dictionnaire !");
        } else {
            Dictionnaire dictionnaire = new Dictionnaire("Larousse");
            alreadyExist = true;
            System.out.println("Le dictionnaire "+dictionnaire.titre+" a été créé");
        }
        if(alreadyExist) {
            System.out.println("Impossible de créer un autre dictionnaire !");
        } else {
            Dictionnaire dictionnaire = new Dictionnaire("Larousse");
            alreadyExist = true;
            System.out.println("Le dictionnaire "+dictionnaire.titre+" a été créé");
        }
    }
}
