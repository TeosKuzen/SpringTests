package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Geopoint implements Serializable {

    @JsonProperty
    private String lon;

    @JsonProperty
    private String lat;

}