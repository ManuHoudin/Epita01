public class Centaure {
    int nbBras = 2;
    int nbPattes = 4;
    static int population = 0;

    public Centaure() {
        population +=1;
        System.out.println("Nombre de centaure : "+population);
    }

    public static void main(String[] args) {
        Centaure petitCentaure = new Centaure();
        Centaure grandCentaure = new Centaure();
        Centaure beauCentaure = new Centaure();
    }
}
