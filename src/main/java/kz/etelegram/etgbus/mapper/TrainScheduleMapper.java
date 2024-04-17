package kz.etelegram.etgbus.mapper;

import kz.etelegram.etgbus.dto.TrainScheduleDTO;
import kz.etelegram.etgbus.entity.TrainSchedule;
import org.mapstruct.Mapper;

@Mapper
public interface TrainScheduleDTOMapper {
    TrainScheduleDTO toDto(TrainSchedule entity);
}
