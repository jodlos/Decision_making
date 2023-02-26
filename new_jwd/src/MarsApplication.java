public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Zmiana temperatury do -90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Laboratorium 2.1");
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja";
        opportunity.speed = 10;
        opportunity.temperature = -95;
        opportunity.showAttributes();

        System.out.println("--------------------");

        opportunity.chcekStatus();


    }

}
