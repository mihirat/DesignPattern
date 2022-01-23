public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("yay");
        AbstractDisplay d3 = new StringDisplay("hello world");
        d1.display();
        d2.display();
        d3.display();
    }
}
