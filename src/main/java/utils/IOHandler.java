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
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");

        String string = scanner.next();
        String[] splitString = string.split(",");

        for(String carName : splitString) {
            Validator.checkCarName(carName);
            Car car = new Car(carName);
            carList.addCar(car);
        }
    }

}
