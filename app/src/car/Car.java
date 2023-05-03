package car;

public class Car {
  private String name;
  private String manufacturer;
  private int year;

  public Car(String nameCar, String manufacturerCar, int yearCar) {
    name = nameCar;
    manufacturer = manufacturerCar;
    year = yearCar;
  }

  public String getName() {
    return name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getYear() {
    return year;
  }


}
