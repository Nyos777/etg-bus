package kz.etelegram.etgbus.service;

import kz.etelegram.etgbus.dto.TrainScheduleDTO;
import kz.etelegram.etgbus.entity.TrainSchedule;
import kz.etelegram.etgbus.mapper.TrainScheduleMapper;
import kz.etelegram.etgbus.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static kz.etelegram.etgbus.mapper.TrainScheduleMapper.TRAIN_SCHEDULE_MAPPER;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public TrainScheduleDTO saveSchedule(TrainScheduleDTO trainScheduleDTO){
        var trainSchedule = TRAIN_SCHEDULE_MAPPER.toEntity(trainScheduleDTO);
        var savedSchedule = scheduleRepository.save(trainSchedule);
        return TRAIN_SCHEDULE_MAPPER.toDto(savedSchedule);
    }
}
