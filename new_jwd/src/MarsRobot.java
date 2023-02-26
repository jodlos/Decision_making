public class MarsRobot {
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if(temperature < -88) {
            status = "Powrót do domu.";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);

    }

    public void chcekStatus() {
        System.out.println("Bieżący status robota: " + status);
    }
}
