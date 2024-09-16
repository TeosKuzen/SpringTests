package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Serving implements Serializable {

    @JsonProperty
    private List<Object> forDays;

    @JsonProperty
    private String name;

    @JsonProperty
    private int count;

}