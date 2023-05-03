package parkingGate;

import java.time.LocalTime;

public class ParkingGate {
  public boolean isComercialTime() {
    LocalTime startTime = LocalTime.of(8, 0);
    LocalTime endTime = LocalTime.of(18, 0);
    LocalTime nowTime = LocalTime.now();

    return nowTime.isAfter(startTime) && nowTime.isBefore(endTime);
  }
}
