package com.t2f2.t2f2webproject.controller;

import com.t2f2.t2f2webproject.dto.SortType;
import com.t2f2.t2f2webproject.dto.file.FileMovementsRequestDTO;
import com.t2f2.t2f2webproject.service.FileMovementsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/api/file-activities")
public class FileMovementsController {

    private final FileMovementsService fileMovementsService;

    public FileMovementsController(FileMovementsService fileMovementsService){
        this.fileMovementsService=fileMovementsService;
    }

    @GetMapping(path = "")
    public ResponseEntity<?> getFilemovementsView(@RequestParam int page,
                                                                         @RequestParam(required = false) String summary,
                                                                         @RequestParam(required = false) String sort,
                                                                         @RequestParam(required = false) String startDate,
                                                                         @RequestParam(required = false) String endDate,
                                                                         @RequestParam(required = false) String employee,
                                                                         @RequestParam(required = false) String file){
        FileMovementsRequestDTO fileMovementsRequestDTO=FileMovementsRequestDTO.builder()
                .page(page)
                .summary(summary)
                .sort(SortType.valueOf(sort))
                .startDate(LocalDateTime.parse(startDate))
                .endDate(LocalDateTime.parse(endDate))
                .employee(employee)
                .file(file).build();


        return ResponseEntity.ok(fileMovementsService.getFileMovements(fileMovementsRequestDTO));
    }

    @GetMapping(path = "/abnomal")
    public ResponseEntity<?> getAbnomalView(@RequestParam int page,
                                                                   @RequestParam(required = false) String summary,
                                                                   @RequestParam(required = false) String sort,
                                                                   @RequestParam(required = false) String startDate,
                                                                   @RequestParam(required = false) String endDate,
                                                                   @RequestParam(required = false) String employee,
                                                                   @RequestParam(required = false) String file){

        FileMovementsRequestDTO fileMovementsRequestDTO=FileMovementsRequestDTO.builder()
                .page(page)
                .summary(summary)
                .sort(SortType.valueOf(sort))
                .startDate(LocalDateTime.parse(startDate))
                .endDate(LocalDateTime.parse(endDate))
                .employee(employee)
                .file(file).build();


        return ResponseEntity.ok(fileMovementsService.getFileMovements(fileMovementsRequestDTO));
    }
}