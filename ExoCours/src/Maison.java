public class Maison implements AvecChauffage, AvecClimatisation {
    int température;

    @Override
    public void chauffer () {
        température += 1;
    }

    @Override
    public void refroidir() {
        température -= 1;
    }
}
