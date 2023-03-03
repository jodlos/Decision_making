public class Weather {
    public static void main(String[] args) {

        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ...");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;

        System.out.println(fah + " stopni Celsjusza\n");

        int z = 1;
        z = z++;
        System.out.println(z);
        System.out.println(z);

    }
}
