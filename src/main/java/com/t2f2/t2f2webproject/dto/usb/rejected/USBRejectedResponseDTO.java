package com.t2f2.t2f2webproject.dto.usb.rejected;

import com.t2f2.t2f2webproject.dto.PageableDTO;
import com.t2f2.t2f2webproject.dto.SortType;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class USBRejectedResponseDTO {
    private List<USBRejectedContentDTO> contents;
    private PageableDTO pageable;
    private long totalElements;
    private int totalPages;
    private boolean last;
    private boolean first;
    private SortType sort;
}
