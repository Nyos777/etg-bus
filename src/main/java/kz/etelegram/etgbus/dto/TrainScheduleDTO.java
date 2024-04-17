package kz.etelegram.etgbus.service;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public record TrainScheduleDTO (
     LocalDateTime msgTime,
     Integer msgId,
     String trainId,
     String crewOrigSta,
     String crewDestSta
){}