package fc.week3.inherit.sam2;

public class InstanceofTest {
    public static void main(String[] args) {
        Car car = new Car("아반떼", 250);
        Bench ben = new Bench();

        System.out.println("남자 instanceof 사람 : " + (ben instanceof Car));
        System.out.println("남자 instanceof 사람 : " + (car instanceof Bench));



    }
}
