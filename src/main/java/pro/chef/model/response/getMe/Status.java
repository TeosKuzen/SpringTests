package pro.chef.model.response.getMe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
public class Status {

    @JsonProperty
    private String name;

    @JsonProperty
    private String id;

    @JsonProperty
    private int sort;

    @JsonProperty
    private String cashback;

}