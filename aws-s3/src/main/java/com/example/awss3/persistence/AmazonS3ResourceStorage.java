package com.example.awss3.persistence;

import com.example.awss3.dto.FileDetail;
import org.springframework.web.multipart.MultipartFile;

public class AmazonS3ResourceStorage implements AmazonS3ResourceRepository{

    @Override
    public String save(FileDetail fileDetail, MultipartFile multipartFile) {
        return null;
    }
}
