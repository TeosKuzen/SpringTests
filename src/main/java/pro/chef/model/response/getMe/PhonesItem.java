package pro.chef.model.response.getMe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
public class PhonesItem implements Serializable {

    @JsonProperty
    private boolean isPrimary;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String id;

}