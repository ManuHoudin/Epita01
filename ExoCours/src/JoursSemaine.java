public enum JoursSemaine {
    LUNDI(false, ":-|"),
    MARDI(false, ":-|"),
    MERCREDI(false, ";-)"),
    JEUDI(false, ":-|"),
    VENDREDI(false, ";o)"),
    SAMEDI(true, ";o))"),
    DIMANCHE(true, ";o)");


    private boolean isWeekEnd;
    private String smiley;

    JoursSemaine(boolean isWeekEnd, String smiley) {
        this.isWeekEnd = isWeekEnd;
        this.smiley = smiley;
    }

    public boolean getOpenDay() {
        return isWeekEnd;
    }

    public String getSmiley() {
        return smiley;
    }

    public static void main(String[] args) {
        JoursSemaine[] semaine = JoursSemaine.values();
        String openDay;

        for (int i=0; i < semaine.length; i++) {

            if(semaine[i].isWeekEnd = true) {
                openDay = "jour férié";
            } else {
                openDay = "jour ouvré";
            };
            System.out.println(semaine[i].name());
            System.out.println(semaine[i].getOpenDay());
            System.out.println(semaine[i].getSmiley());
        }

        int ordinaleJeudi = JoursSemaine.JEUDI.ordinal();
        int ordinaleSamedi = JoursSemaine.SAMEDI.ordinal();

        if(ordinaleJeudi < ordinaleSamedi) {
            System.out.println("Jeudi est bien avant samedi !");
        }
    }
}
