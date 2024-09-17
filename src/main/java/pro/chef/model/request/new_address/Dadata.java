package pro.chef.model.request.new_address;

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
public class Dadata implements Serializable {

    @JsonProperty
    private Object geoLat;

    @JsonProperty
    private Object geoLon;

    @JsonProperty
    private boolean house;

}