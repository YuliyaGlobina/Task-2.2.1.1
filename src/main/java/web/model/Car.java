package web.model;

public class Car {
    private String carBrand;
    private String carColor;
    private int carPrice;

    public Car(String carBrand, String carColor, int carPrice) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return carBrand + "  " + carColor + "  " + carPrice;
    }
}
