package com.t2f2.t2f2webproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/settings")
public class SettingsController {
//    // 이상 행동 설정 조회
//    @GetMapping("/settings/behavior")
//    public ResponseEntity<?> getBehaviorSettings() {
//        return ResponseEntity.ok(apiService.getBehaviorSettings());
//    }
//
//    // 이상 행동 설정 저장
//    @PostMapping("/settings/behavior")
//    public ResponseEntity<?> saveBehaviorSettings(@RequestBody BehaviorSettingsRequest request) {
//        apiService.saveBehaviorSettings(request);
//        return ResponseEntity.ok(Collections.singletonMap("message", "설정이 성공적으로 저장되었습니다."));
//    }
}
