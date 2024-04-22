package roomescape.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomescape.dao.ReservationTimeDao;
import roomescape.domain.ReservationTime;
import roomescape.dto.ReservationTimeDto;

@Service
public class ReservationTimeService {
    @Autowired
    private ReservationTimeDao reservationTimeDao;

    public List<ReservationTime> findAll() {
        return reservationTimeDao.findAll();
    }

    public ReservationTime save(ReservationTimeDto reservationTimeDto) {
        return reservationTimeDao.save(reservationTimeDto);
    }

    public void delete(long id) {
        reservationTimeDao.delete(id);
    }
}