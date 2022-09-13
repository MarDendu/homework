package untitled22.src;

public class Guitar implements untitled22.src.Instrument {
    private int cordNumber;

    public int getCordNumber() {
        return cordNumber;
    }

    public void setCordNumber(int cordNumber) {
        this.cordNumber = cordNumber;
    }


    public void play() {
        System.out.println("Играет гитара");
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;

        Guitar guitar = (Guitar) o;

        return cordNumber == guitar.cordNumber;
    }


    public int hashCode() {
        return cordNumber;
    }


    public String toString() {
        return "Guitar{" +
                "cordNumber=" + cordNumber +
                '}';
    }
}
