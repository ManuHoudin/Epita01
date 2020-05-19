import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;


public class Chanson {



    public static void main(String[] args) {
        int compteurMot = 0;


        Path path = Paths.get("C:\\Users\\stagiaire\\Projets\\Java\\Santiano.txt");
        Path newPath = Paths.get("C:\\Users\\stagiaire\\Projets\\Java\\Occurences.txt");

        try {
            ArrayList<String> chanson = (ArrayList<String>) Files.readAllLines(path);

            OutputStream output = null;

            for (String element : chanson) {
                System.out.println(element);
                String mots[] = element.split(" ");
                int compteurDoublons = 0;

                for (int i = 0; i < mots.length; i++) {
                    compteurMot++;

                    String motDouble = mots[i];
                    for (int j = 0; j < mots.length; j++) {
                        if (motDouble == mots[j]) {
                            compteurDoublons++;
                        }
                    }
                    System.out.println("Nombre occurences du mot "+motDouble+" : "+compteurDoublons);
                }
                System.out.println("Nombre de mots : " + compteurMot);
                byte[] info = ("Nombre de mots : "+compteurMot).getBytes();
                try {
                    output = new BufferedOutputStream(Files.newOutputStream(newPath, CREATE));
                    output.write(info);
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
