package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EventPlanner {
  LocalDate eventDate;
  LocalTime eventTime;

  public void bookEvent(String date, String time) {
    eventDate = LocalDate.parse(date);
    eventTime = LocalTime.parse(time);
  }

  public void checkEvent() {
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();

    if (currentDate.equals(eventDate)) {
      if (currentTime.isAfter(eventTime)) {
        System.out.println("Event already started or ended.");
      } else {
        System.out.println("Event has not started yet.");
      }
    } else  {
      System.out.println("Event ended or not started yet.");
    }
  }

  public static void main(String[] args) {
    EventPlanner eventPlanner = new EventPlanner();

    eventPlanner.bookEvent("2022-01-06", "17:00:00");
    eventPlanner.checkEvent();

    // Formats date to BR date
    String dateFormat = "dd/MM/yyyy";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
    System.out.println(dateTimeFormatter.format(LocalDate.now()));
  }
}
