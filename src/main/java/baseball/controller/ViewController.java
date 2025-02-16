package baseball.controller;
import camp.nextstep.edu.missionutils.Console;

public class ViewController {
    public static int ViewController(int strike, int ball) {
        if(strike == 0 && ball == 0){
            System.out.println("낫싱");
        }
        else{
            System.out.println(ball + "볼, " + strike +"스트라이크");
        }

        if(strike == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String num = Console.readLine();

            if(num.equals("1")){
                strike = 0;
            }
            else{
                System.out.println("게임 종료");
            }
        }
        return strike;
    }
}
