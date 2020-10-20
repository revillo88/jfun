package io.hauer.demo.jfun;

import lombok.Data;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;

@Data
public class Picture {
    private String path;
    private byte[] content;

    public void loadContent() {
        try {
            content = Files.readAllBytes(ResourceUtils
                    .getFile(path)
                    .toPath());
        } catch (IOException ioException) {
            // logging
        }
    }
}
