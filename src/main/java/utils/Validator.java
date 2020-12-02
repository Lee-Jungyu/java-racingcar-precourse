package utils;

public class Validator {
    private final static int MAX_CAR_NAME_LENGTH = 5;
    public static void checkCarName(String carName) {
        try {
            if(carName.length() > MAX_CAR_NAME_LENGTH) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.err.println("[ERROR] 자동차 이름의 길이는 " + MAX_CAR_NAME_LENGTH + " 이하 이다.");
        }
    }
}
