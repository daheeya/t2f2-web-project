package com.t2f2.t2f2webproject.dto.file;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class FileMovementsContentDTO {
    private String computerName;
    private LocalDateTime moveTime;
    private String fileName;
    private String source;
    private String destination;
    private String summary;
}