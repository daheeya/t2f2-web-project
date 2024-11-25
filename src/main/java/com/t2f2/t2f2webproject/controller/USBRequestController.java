package com.t2f2.t2f2webproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/usb-requests")
public class USBRequestController {

    @GetMapping(path = "")
    public String getUsbRequests(){
        return "/usb";
    }

    @PostMapping(path = "/{usbId}/approve")
    public ResponseEntity<?> approveUsbRequest(@PathVariable Long usbId){
        return ResponseEntity.ok(Collections.singletonMap("message","USB 요청이 승인되었습니다."));
    }

    @PostMapping(path = "/{usbId}/reject")
    public ResponseEntity<?> rejectUsbRequest(@PathVariable Long usbId){
        return ResponseEntity.ok(Collections.singletonMap("message","USB 요청이 거절되었습니다."));
    }
}
