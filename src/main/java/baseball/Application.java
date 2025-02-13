package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arr = new ArrayList<>(3);

        while (arr.size() < 3) {
            int ran = random.nextInt(9) + 1;
            if (!arr.contains(ran)) {
                arr.add(ran);
            }
        }


        Scanner sc = new Scanner(System.in);
        int strike = 0;
        int ball;

        while(strike != 3){
            System.out.println("숫자를 입력해주세여 : ");
            int num = sc.nextInt();
            int copyNum = num;
            List<Integer> numArr = new ArrayList<>();

            strike = 0;
            ball = 0;

            numArr.add(num / 100);
            num %= 100;
            numArr.add(num / 10);
            num %= 10;
            numArr.add(num);

            if(copyNum >= 1000 || copyNum <= 99) {
                System.out.println("잘못된 입력입니다. 세 자리 숫자를 입력하세요.");
                continue;
            }


            for (int i = 0; i < 3; i++) {
                if (arr.get(i).equals(numArr.get(i))) {
                    strike++;
                } else if (arr.contains(numArr.get(i))) {
                    ball++;
                }
            }

            if(strike == 0 && ball == 0){
                System.out.println("낫싱");
            }
             else{
                System.out.println(ball + "볼, " + strike +"스트라이크");
            }

             if(strike == 3){
                 System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                 System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                 int re = sc.nextInt();

                 if(re == 1){
                     strike = 0;
                 }
                 else{
                     System.out.println("게임 종료");
                 }
             }
        }
    }
}
