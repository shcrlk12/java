package fc.week1.project;
import java.util.Scanner;

public class Problem2 {

    void displayStartMenu() {
        System.out.println("[메뉴 선택]");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");
    }

    boolean enterInput(int inputMenu) {

        switch(inputMenu)
        {
            case 1 :
            System.out.println("회원 관리 메뉴를 선택했습니다.");
            return true;

            case 2 :
            System.out.println("과목 관리 메뉴를 선택했습니다.");
            return true;

            case 3 :
            System.out.println("수강 관리 메뉴를 선택했습니다.");
            return true;

            case 4 :
            System.out.println("결제 관리 메뉴를 선택했습니다.");
            return true;

            case 5 :
            System.out.println("프로그램을 종료합니다.");
            return false;

            default :
            return false;
        }
    }
    public static void main(String[] args) {

        Problem2 p = new Problem2();
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            p.displayStartMenu();
            input = sc.nextInt();
        }
        while(p.enterInput(input));

        sc.close();
    }
}
