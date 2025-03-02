package com.java_ecommerce.java_shops.service.image;

import com.java_ecommerce.java_shops.dto.ImageDto;
import com.java_ecommerce.java_shops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImage(List<MultipartFile> images, Long productId);

    void updateImage(MultipartFile image, Long productId);
}
