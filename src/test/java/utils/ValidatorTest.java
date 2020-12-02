package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    public void 정수확인_true() {
        String tmpString = "1";
        boolean check = Validator.isNumeric(tmpString);
        Assertions.assertEquals(check, true);
    }

    @Test
    public void 정수확인_false() {
        String tmpString = "0.1";
        boolean check = Validator.isNumeric(tmpString);
        Assertions.assertEquals(check, false);
    }

    @Test
    public void 자동차이름확인_true() {
        String[] stringArray = {"AAAAA","bbb","C"};
        boolean check = Validator.checkCarName(stringArray);
        Assertions.assertEquals(check, true);
    }

    @Test
    public void 자동차이름확인_false() {
        String[] stringArray = {"AAAAAA","bbb","C"};
        boolean check = Validator.checkCarName(stringArray);
        Assertions.assertEquals(check, false);
    }

    @Test
    public void 이동회수확인_true() {
        String cnt = "1";
        boolean check = Validator.checkMoveCount(cnt);
        Assertions.assertEquals(check, true);
    }

    @Test
    public void 이동회수확인_false() {
        String cnt = "0";
        //String cnt = "0.1";
        //String cnt = "a";
        boolean check = Validator.checkMoveCount(cnt);
        Assertions.assertEquals(check, false);
    }
}
