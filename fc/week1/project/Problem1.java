package fc.week1.project;

public class Problem1 {
    public static void main(String[] args) {
        char name1 = '김', name2 = '정', name3 = '원';
        int name1Hex = 0, name2Hex = 0, name3Hex = 0;
        
        for(char i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++) {
            if(name1 == i) {
                name1Hex = i; 
            }
            if(name2 == i) {
                name2Hex = i; 
            }
            if(name3 == i) {
                name3Hex = i; 
            }

            if((name1Hex != 0) && (name2Hex != 0) && (name3Hex != 0)){
                break;
            }
        }

        System.out.format("%x, %x, %x",name1Hex, name2Hex, name3Hex);
    }
}
