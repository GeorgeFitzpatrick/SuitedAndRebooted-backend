package com.suited.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author George Fitzpatrick
 */
@RestController
public class Controller {

    @PostMapping("/")
    public ResponseEntity<String> handle(@RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        if (file == null || file.isEmpty()) {
            return ResponseEntity.status(BAD_REQUEST).body("No file uploaded");
        }

        byte[] bytes = file.getBytes();
        return ResponseEntity.ok("File uploaded successfully: " + file.getOriginalFilename());
    }

}
