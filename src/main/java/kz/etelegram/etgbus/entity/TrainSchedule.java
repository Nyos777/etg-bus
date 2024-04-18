package kz.etelegram.etgbus.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TrainSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "msgTime")
    private LocalDateTime msgTime;
    @Column(name = "msgId")
    private Integer msgId;
    @Column(name = "trainId")
    private String trainId;
    @Column(name = "crewOrigSta")
    private String crewOrigSta;
    @Column(name = "crewDestSta")
    private String crewDestSta;
}
