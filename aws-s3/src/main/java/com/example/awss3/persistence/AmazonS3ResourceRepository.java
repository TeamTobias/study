package com.example.awss3.persistence;

import com.example.awss3.dto.FileDetail;
import org.springframework.web.multipart.MultipartFile;

public interface AmazonS3ResourceRepository {
    String save(FileDetail fileDetail, MultipartFile multipartFile);
}