package roomescape;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationDto {
    private final String name;
    private final LocalDate date;
    private final LocalTime time;

    public ReservationDto(String name, LocalDate date, LocalTime time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }


}
