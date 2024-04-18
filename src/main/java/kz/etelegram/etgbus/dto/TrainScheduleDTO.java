package kz.etelegram.etgbus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
@JacksonXmlRootElement(localName = "TRAIN_SCHEDULE")
public class TrainScheduleDTO {
    private Long id;
    @JsonProperty("MSG_TIME")
    private String msgTime;
    @JsonProperty("MSG_ID")
    private Integer msgId;
    @JsonProperty("TRAIN_ID")
    private String trainId;
    @JsonProperty("CREW_ORIG_STA")
    private String crewOrigSta;
    @JsonProperty("CREW_DEST_STA")
    private String crewDestSta;
}