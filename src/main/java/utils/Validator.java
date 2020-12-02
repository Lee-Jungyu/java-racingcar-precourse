package utils;

public class Validator {
    private final static int MAX_CAR_NAME_LENGTH = 5;
    private final static int MIN_MOVE_COUNT = 1;

    public static boolean isNumeric(String tmpString) {
        try {
            Integer.parseInt(tmpString);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean checkCarName(String[] carNameArray) {
        boolean check = true;

        for(String carName : carNameArray) {
            if (carName.length() > MAX_CAR_NAME_LENGTH) {
                check = false;
                break;
            }
        }

        if(!check) System.err.println("[ERROR] 자동차 이름의 길이는 " + MAX_CAR_NAME_LENGTH + " 이하 이다.");

        return check;
    }

    public static boolean checkMoveCount(String moveCnt) {
        boolean check = isNumeric(moveCnt);
        if(!check) {
            System.err.println("[ERROR] 시도 회수는 정수형이다.");
            return false;
        }

        int cnt = Integer.parseInt(moveCnt);
        if(cnt < MIN_MOVE_COUNT) {
            System.err.println("[ERROR] 시도 회수는 " + MIN_MOVE_COUNT + " 이상 이다.");
            return false;
        }

        return true;
    }
}
