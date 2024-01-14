package site.acatech.humanapi;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "site.acatech.humanapi")
public class CustomProperties {
    private String apiUrl;
}
