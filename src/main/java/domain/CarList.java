package domain;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList() {
        carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getWinnerList() {
        int max_position = 0;

        List<Car> winnerList = new ArrayList<>();

        for(Car car : carList) {
            if(car.getPosition() > max_position) {
                winnerList.clear();
                winnerList.add(car);
            }
            if(car.getPosition() == max_position) {
                winnerList.add(car);
            }
        }

        return winnerList;
    }
}
