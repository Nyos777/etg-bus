package kz.etelegram.etgbus.repository;

import kz.etelegram.etgbus.dto.TrainScheduleDTO;
import kz.etelegram.etgbus.entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<TrainSchedule, Integer> {
}
