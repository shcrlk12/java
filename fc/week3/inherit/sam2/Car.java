package fc.week3.inherit.sam2;

public class Car {
    String name = "차량";
    double maxSpeed;
    int capacity;

    Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    void printInform() {
        System.out.println("이름 : " + name);
        System.out.println("최대 속도 : " + maxSpeed);
        System.out.println("정원 : " + capacity);
    }
}
