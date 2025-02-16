package baseball.model;

import camp.nextstep.edu.missionutils.Console;

public class InputModel {

    public static String InputModel(){
        String num = Console.readLine();

        if (num.length() != 3) {
            throw new IllegalArgumentException();
        }

        return num;
    }

}
