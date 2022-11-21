package com.example.awss3.service;

import com.example.awss3.dto.FileDetail;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    FileDetail save(MultipartFile multipartFile);


}
