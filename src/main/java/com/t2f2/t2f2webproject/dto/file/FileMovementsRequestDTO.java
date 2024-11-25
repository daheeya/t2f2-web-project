package com.t2f2.t2f2webproject.dto.file;

import com.t2f2.t2f2webproject.dto.SortType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class FileMovementsRequestDTO {
    private int page;
    private String summary;
    private SortType sort;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String employee;
    private String file;
}