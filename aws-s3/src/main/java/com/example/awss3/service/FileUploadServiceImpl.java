package com.example.awss3.service;

import com.example.awss3.dto.FileDetail;
import com.example.awss3.persistence.AmazonS3ResourceRepository;
import com.example.awss3.persistence.AmazonS3ResourceStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class FileUploadServiceImpl implements FileUploadService{

    private final AmazonS3ResourceRepository amazonS3ResourceRepository;

    @Override
    public FileDetail save(MultipartFile multipartFile) {
        FileDetail fileDetail = FileDetail.multipartOf(multipartFile);
        amazonS3ResourceRepository.store(fileDetail.getPath(), multipartFile);
        return fileDetail;
    }
}
