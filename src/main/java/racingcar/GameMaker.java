package racingcar;

import domain.Car;
import domain.CarList;
import utils.IOHandler;
import utils.RandomUtils;

import java.util.Scanner;

public class GameMaker {
    private IOHandler ioHandler;
    private CarList carList;

    public GameMaker(Scanner scanner) {
        ioHandler = new IOHandler(scanner);
    }

    public void startGame() {
        carList = new CarList();

        ioHandler.inputCarList(carList);
        int moveCount = ioHandler.inputMoveCount();

        execute(moveCount);

        ioHandler.printGameResult(carList);
    }

    public void execute(int moveCount) {
        if(moveCount == 0) return;

        for(Car car : carList.getCarList()) {
            int randomNumber = RandomUtils.nextInt(0, 9);
            car.move(randomNumber);
        }

        ioHandler.printMoveResult(carList);

        execute(moveCount - 1);
    }
}
