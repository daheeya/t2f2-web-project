package com.t2f2.t2f2webproject.dto.usb.pending;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class USBPendingContentDTO {
    private String usbId;
    private String serialNumber;
    private String model;
    private String computerName;
    private String department;
    private LocalDateTime requestTime;
}
