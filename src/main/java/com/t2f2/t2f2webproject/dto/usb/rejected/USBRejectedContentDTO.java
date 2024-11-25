package com.t2f2.t2f2webproject.dto.usb.rejected;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class USBRejectedContentDTO {
    private String usbId;
    private String serialNumber;
    private String model;
    private String computerName;
    private String department;
    private LocalDateTime requestTime;
    private LocalDateTime rejectedTime;
}
