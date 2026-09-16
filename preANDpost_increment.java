public class preANDpost_increment {
    public static void main(String[] args) {
    int a = 10;
    int b = a-- + --a;
    System.out.println(a + " " + b);
    System.out.println(a + b);
    }
}