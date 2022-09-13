package untitled21.src;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[6];
        printables[0] = new untitled21.src.Book();
        printables[1] = new untitled21.src.Magazine();
        printables[2] = new untitled21.src.Book();
        printables[3] = new untitled21.src.Magazine();
        printables[4] = new untitled21.src.Book();
        printables[5] = new untitled21.src.Magazine();

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
