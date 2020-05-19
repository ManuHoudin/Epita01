public enum Planet {
    MERCURY (3.303e+23, 2.4397e3),
    VENUS (4.869e+24, 6.0518e3),
    EARTH (5.976e+24, 6.37814e3);

    private final double mass;
    private final double radius;

    /*private*/ Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    // Universal gravitational constant (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    public static void main(String[] args) {
        double earthRadius = Planet.EARTH.getRadius();
        System.out.println(Planet.EARTH+" radius is : "+earthRadius+"km");
        double mercuryMass = Planet.MERCURY.getMass();
        System.out.println(Planet.MERCURY+" mass is : "+mercuryMass+"kg");
        int venusSurfaceGravity = (int)Planet.VENUS.surfaceGravity();
        System.out.println(Planet.VENUS+" surface gravity is : "+venusSurfaceGravity+" ms-2");
    }
}

