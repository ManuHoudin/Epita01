import java.lang.Integer;

public class ChaineCaractere {

    static String maChaine = "tout doit être en majuscule et il faut des aaaa !";
    static int compteurLettre = 0;
    static String newChaine;

    public static String couperChaine(String chaine,int beginIndex, int endIndex) {
        return chaine.substring(beginIndex, endIndex);
    }
    public static String transformer(int element) {
        return Integer.toString(element);
    }
    /*public static int transformerString(String element) {
        return String.valueOf(element);
    }*/

    public static void main(String[] args) {
        System.out.println(maChaine.toUpperCase());
        char[] tableauChaine = maChaine.toCharArray();
        System.out.println("Longeur de la chaîne : " + tableauChaine.length);

        for (int i = 0; i < tableauChaine.length; i++) {
            if (tableauChaine[i] == 'a') {
                compteurLettre++;
            }
        }
        System.out.println("Nombre de caractère 'a' présent dans la chaîne : " + compteurLettre);
        newChaine = maChaine.replace('a', '4');
        System.out.println("Chaine avec a transformé en 4 : " + newChaine);

        System.out.println(couperChaine(maChaine,0, 4)+couperChaine(maChaine, 10, maChaine.length()));
        String chaine1 = maChaine.substring(0, 4);
        String chaine2 = maChaine.substring(20, maChaine.length());
        System.out.println("Chaine coupée : "+chaine1+chaine2);

        int intToString = 10;
        System.out.println(transformer(intToString));

        String chainToInt = "Blabla";
        //System.out.println(transformerString(chainToInt));
    }
}
