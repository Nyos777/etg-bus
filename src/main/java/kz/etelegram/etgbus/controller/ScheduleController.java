package kz.etelegram.etgbus.controller;

import kz.etelegram.etgbus.dto.TrainScheduleDTO;
import kz.etelegram.etgbus.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<TrainScheduleDTO> saveSchedule(@RequestBody TrainScheduleDTO trainSchedule) {
        try {
            var scheduleDTO = scheduleService.saveSchedule(trainSchedule);
            return ResponseEntity.ok(scheduleDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}