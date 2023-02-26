public class Squares {
    public static void main(String[] args) {
        int sideLength = 19;

        System.out.println("Pole powierzchni kwadratu o boku " + sideLength + " jest równe " + (sideLength * sideLength) + ".");
        System.out.println("Obwód kwadratu o boku " + sideLength + " jest równy " + (sideLength * 4) + ".");
        System.out.println("Przekątna kwadratu o boku " + sideLength + " jest równa " + (sideLength * Math.sqrt(2)) + ".");

    }
}
