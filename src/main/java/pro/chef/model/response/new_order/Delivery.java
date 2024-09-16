package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Delivery implements Serializable {

    @JsonProperty
    private int cost;

    @JsonProperty
    private String address;

    @JsonProperty
    private String typeId;

    @JsonProperty
    private String from;

    @JsonProperty
    private String to;

    @JsonProperty
    private String type;

    @JsonProperty
    private List<Object> selectedIntervals;

}