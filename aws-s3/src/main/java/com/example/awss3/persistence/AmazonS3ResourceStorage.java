package com.example.awss3.persistence;

import org.springframework.web.multipart.MultipartFile;

public class AmazonS3ResourceStorage implements AmazonS3ResourceRepository {

    @Override
    public String store(String filePath, MultipartFile multipartFile) {
        return null;
    }
}
