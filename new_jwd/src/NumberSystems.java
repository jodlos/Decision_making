public class NumberSystems {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));

        int a = 10;
        int b = 5;

        System.out.println("-----------------------");

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("-----------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ','0'));

    }
}
