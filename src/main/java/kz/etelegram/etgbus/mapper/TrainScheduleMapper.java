package kz.etelegram.etgbus.mapper;

import kz.etelegram.etgbus.dto.TrainScheduleDTO;
import kz.etelegram.etgbus.entity.TrainSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper
public interface TrainScheduleMapper {
    TrainScheduleMapper TRAIN_SCHEDULE_MAPPER = Mappers.getMapper(TrainScheduleMapper.class);

    @Mapping(source = "msgTime", target = "msgTime", qualifiedByName = "toString")
    @Mapping(source = "msgId", target = "msgId")
    @Mapping(source = "trainId", target = "trainId")
    @Mapping(source = "crewOrigSta", target = "crewOrigSta")
    @Mapping(source = "crewDestSta", target = "crewDestSta")
    TrainScheduleDTO toDto(TrainSchedule entity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "msgTime", target = "msgTime", qualifiedByName = "toLocalDateTime")
    @Mapping(source = "msgId", target = "msgId")
    @Mapping(source = "trainId", target = "trainId")
    @Mapping(source = "crewOrigSta", target = "crewOrigSta")
    @Mapping(source = "crewDestSta", target = "crewDestSta")
    TrainSchedule toEntity(TrainScheduleDTO dto);


    @Named("toLocalDateTime")
    default LocalDateTime stringToLocalDateTime(String msgTime) {
        return LocalDateTime.parse(msgTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Named("toString")
    default String localDateTimeToString(LocalDateTime msgTime) {
        return msgTime.toString();
    }
}
