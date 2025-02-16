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
            ArrayList<Integer> arr = new ArrayList<>();
            String num = InputModel.InputModel();
            strike = 0;
            ball = 0;

            for (int i = 0; i < num.length(); i++) {
                arr.add(num.charAt(i) - '0');
            }

            for (int i = 0; i < 3; i++) {
                if (arr.get(i).equals(numArr.get(i))) {
                    strike++;
                }
                if (arr.contains(numArr.get(i))) {
                    ball++;
                }
            }
            viewcontroller(strike, ball);
        }
    }

}
