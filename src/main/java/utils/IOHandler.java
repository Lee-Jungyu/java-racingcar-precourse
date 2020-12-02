package utils;

import racingcar.Car;
import racingcar.CarList;

import java.util.Scanner;

public class IOHandler {
    private Scanner scanner;

    public IOHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void inputCarList(CarList carList) {
        boolean check = true;
        String[] carNameArray;

        do {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
            String string = scanner.next();
            carNameArray = string.split(",");

            check = Validator.checkCarName(carNameArray);
        } while (!check);

        for (String carName : carNameArray) {
            Car car = new Car(carName);
            carList.addCar(car);
        }
    }

    public int inputMoveCount() {
        boolean check = true;
        int moveCnt = 0;
        String tmpString;

        do {
            System.out.println("시도 할 회수는 몇 회인가요?");
            tmpString = scanner.next();

            check = Validator.checkMoveCount(tmpString);
        } while(check);

        moveCnt = Integer.parseInt(tmpString);

        return moveCnt;
    }

}
