package com.t2f2.t2f2webproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageableDTO {
    private int pageNumber;
    private int pageSize;
    private int offset;
    private boolean paged;
    private boolean unPaged;
}