public class Main {
    public static void main(String[] args) {
        Document fil = new SmartDocument("/Users/annay/Desktop/test_for_oop.png");
        String res = fil.parse();
        System.out.println(res);
    }
}