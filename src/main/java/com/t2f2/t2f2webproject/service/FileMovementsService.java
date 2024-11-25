package com.t2f2.t2f2webproject.service;

import com.t2f2.t2f2webproject.dto.SortType;
import com.t2f2.t2f2webproject.dto.file.FileMovementsContentDTO;
import com.t2f2.t2f2webproject.dto.file.FileMovementsRequestDTO;
import com.t2f2.t2f2webproject.dto.file.FileMovementsResponseDTO;
import com.t2f2.t2f2webproject.entity.FileMovementsEntity;
import com.t2f2.t2f2webproject.repository.FileMovementsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileMovementsService {
    private final FileMovementsRepository fileMovementsRepository;

    public FileMovementsResponseDTO getFileMovements(FileMovementsRequestDTO requestDTO) {
        validateRequest(requestDTO.getStartDate(),requestDTO.getEndDate(),requestDTO.getPage());

        List<FileMovementsEntity> fileMovementsEntities = fileMovementsRepository.findFileMovements(
                requestDTO.getStartDate().toString(),
                requestDTO.getEndDate().toString(),
                requestDTO.getEmployee(),
                requestDTO.getFile(),
                requestDTO.getSort()
        );

        List<FileMovementsContentDTO> contentList = fileMovementsEntities.stream()
                .map(entity -> FileMovementsContentDTO.builder()
                        .fileName(entity.getFileName())
                        .moveTime(entity.getMoveTime())
                        .computerName(entity.getComputerName())
                        .source(entity.getSourcePath())
                        .destination(entity.getDestinationPath())
                        .summary("summary") // TODO : 요약 기능 개발하기
                        .build())
                .toList();

        return FileMovementsResponseDTO.builder()
                .contents(contentList)
                .pageable(null) //TODO : 페이징 기능 개발하기
                .totalElements(contentList.size())
                .totalPages(1)
                .last(true)
                .first(true)
                .sort(SortType.DESC)  //TODO : 정렬 기능 개발하기
                .build();
    }

    private void validateRequest(LocalDateTime startDate, LocalDateTime endDate, int page) {
        // TODO : 요청 데이터 유효성 검사

    }

    public FileMovementsResponseDTO getAbnomalMovements(FileMovementsRequestDTO requestDTO) {
        validateRequest(requestDTO.getStartDate(),requestDTO.getEndDate(),requestDTO.getPage());

        List<FileMovementsEntity> fileMovementsEntities = fileMovementsRepository.findFileMovements(
                requestDTO.getStartDate().toString(),
                requestDTO.getEndDate().toString(),
                requestDTO.getEmployee(),
                requestDTO.getFile(),
                requestDTO.getSort()
        );

        List<FileMovementsContentDTO> contentList = fileMovementsEntities.stream()
                .map(entity -> FileMovementsContentDTO.builder()
                        .fileName(entity.getFileName())
                        .moveTime(entity.getMoveTime())
                        .computerName(entity.getComputerName())
                        .source(entity.getSourcePath())
                        .destination(entity.getDestinationPath())
                        .summary("summary") // TODO : 요약 기능 개발하기
                        .build())
                .toList();

        return FileMovementsResponseDTO.builder()
                .contents(contentList)
                .pageable(null) //TODO : 페이징 기능 개발하기
                .totalElements(contentList.size())
                .totalPages(1)
                .last(true)
                .first(true)
                .sort(SortType.DESC)  //TODO : 정렬 기능 개발하기
                .build();
    }

    // TODO : 이상 행동 로직
    private void setAbnomal(){

    }


}