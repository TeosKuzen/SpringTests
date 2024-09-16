package pro.chef.model.response.new_address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Geopoint {

    @JsonProperty
    private String lon;

    @JsonProperty
    private String lat;

}