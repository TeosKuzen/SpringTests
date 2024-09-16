package pro.chef.config.properties;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "config")
@Setter
@Getter
@Validated
public class ConfigProperties {

  @NotNull
  private Boolean logging;

  @NotEmpty
  private String bearerToken;

  @NotNull
  private String baseUrl;

  @NotEmpty
  private String token;

  @NotNull
  private String phone;

  @NotNull
  private String platformId;

  @NotNull
  private String platformVersion;
}
