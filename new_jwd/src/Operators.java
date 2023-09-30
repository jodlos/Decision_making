public class Operators {
    public static void main(String[] args) {
        int x =5;
        x = x + 2;
        int y = 4;


        System.out.println(x + y);
        System.out.println( "Dzielenie (x/y): " + (x/y) + " reszta " + (x % y));
        System.out.println(x / (double)y);

        System.out.println("----------------------");


        int a = 5;
        int b = 5;

        System.out.println(a & b);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
