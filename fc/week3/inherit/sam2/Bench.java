package fc.week3.inherit.sam2;

public class Bench extends Car{
    String name = "자동차";
    int 배기량;
    
    Bench() {
        super("아반떼", 250);
        this.배기량 = 3000;
    }
    void printInform() {
        System.out.println("이름 : " + super.name);
        System.out.println("최대 속도 : " + maxSpeed);
        System.out.println("정원 : " + capacity);
        System.out.println("배기랑 : " + 배기량);

        System.out.println("이름 : " + this.name);
    } 
}
