package untitled22.src;

public class Trumpet implements untitled22.src.Instrument {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет труба");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trumpet)) return false;

        Trumpet trumpet = (Trumpet) o;

        return Double.compare(trumpet.diameter, diameter) == 0;
    }

    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
