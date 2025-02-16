package baseball.controller;

import baseball.model.ComputerModel;
import baseball.model.InputModel;

import java.util.ArrayList;

import static baseball.controller.ViewController.viewcontroller;

public class CompareController {
    public static void comparecontroller() {
        ArrayList<Integer> numArr = (ArrayList<Integer>) ComputerModel.randomNumberCreate();
        int strike = -1;
        int ball;

        while (strike != 3) {
            System.out.print("숫자를 입력해주세요 : ");
            ArrayList<Integer> arr = new ArrayList<>();
            String numStr = InputModel.InputModel();
            int num = Integer.parseInt(numStr);
            strike = 0;
            ball = 0;

            arr.add(num / 100);
            num %= 100;
            arr.add(num / 10);
            num %= 10;
            arr.add(num);

            for (int i = 0; i < 3; i++) {
                if (arr.get(i).equals(numArr.get(i))) {
                    strike++;
                }
                else if (arr.contains(numArr.get(i))) {
                    ball++;
                }
            }
            strike = viewcontroller(strike, ball);
        }
    }

}
