package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerModel {

    public static List<Integer> randomNumberCreate() {
        List<Integer> numArr = new ArrayList<>();
        while (numArr.size() < 3) {
            int ranNum = Randoms.pickNumberInRange(1, 9);
            if (!numArr.contains(ranNum)) {
                numArr.add(ranNum);
            }
        }
        return numArr;
    }

}
