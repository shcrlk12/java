package fc.week3.inherit.sam2;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("아반떼", 250);

        car.capacity = 5;

        car.printInform();

        Bench ben = new Bench();

        ben.name = "벤츠";
        ben.maxSpeed = 30;
        ben.capacity = 5;
        ben.배기량 = 3000;

        ben.printInform();
    }
}
