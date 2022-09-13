package untitled22.src;

public class Caisse implements untitled22.src.Instrument {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public  void play() {
        System.out.println("Играет барабан");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caisse)) return false;

        Caisse caisse = (Caisse) o;

        return size != null ? size.equals(caisse.size) : caisse.size == null;
    }

    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }

    public String toString() {
        return "Caisse{" +
                "size='" + size + '\'' +
                '}';
    }
}
