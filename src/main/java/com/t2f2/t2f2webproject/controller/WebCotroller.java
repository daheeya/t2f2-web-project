package com.t2f2.t2f2webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/web")
public class WebCotroller {
    @GetMapping("/usb")
    public String getUsbPage() {
        return "usb"; // resources/templates/index.html을 반환
    }
    @GetMapping("/abnormal_behavior_settings")
    public String getAbnormalBehaviorSettingsPage() {
        return "abnormal_behavior_settings"; // resources/templates/index.html을 반환
    }
    @GetMapping("/abnormal_behavior_view")
    public String getAbnormalBehaviorViewPage() {
        return "abnormal_behavior_view"; // resources/templates/index.html을 반환
    }
    @GetMapping("/employee")
    public String getEmployeePage() {
        return "employee"; // resources/templates/index.html을 반환
    }
    @GetMapping("/filemovement_view")
    public String getFilemovementViewPage() {
        return "filemovement_view"; // resources/templates/index.html을 반환
    }
    @GetMapping("/login")
    public String getLoginPage() {
        return "login"; // resources/templates/index.html을 반환
    }
    @GetMapping("/test")
    public String getTestPage() {
        return "test"; // resources/templates/index.html을 반환
    }
}
