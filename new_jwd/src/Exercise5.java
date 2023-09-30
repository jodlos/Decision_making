public class Exercise5 {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        int x = 14000;
        double y = (x * 1.4);
        double z = (y - 1500);
        double a = (z * 1.12);

        System.out.println("First year: " + (y));
        System.out.println("Second year: " + (z));
        System.out.println("Third year: " + (a));

        System.out.println("Exercise 2");

        int aa = 35567899;

        boolean result = (aa % 5) == 0 && (aa % 7) == 0;
        System.out.println("Czy liczba jest podzielna przez 5 i 7? " + result);

        System.out.println("Exercise 3");

        int xx = 5;
        int n = 3;
        int mask = 1 << n - 1;

        boolean result2 = (xx & mask) > 0;

        System.out.println("Dla liczby " + xx + " na " + n + "tej pozycji znajduje się bit: " + result2);

        System.out.println();
        System.out.println();

        System.out.println(String.format("%32s", Integer.toBinaryString(xx)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(xx & mask)).replace(' ', '0'));

    }

}
