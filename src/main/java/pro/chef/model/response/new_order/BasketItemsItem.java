package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class BasketItemsItem implements Serializable {

    @JsonProperty
    private boolean hasPreferredComponents;

    @JsonProperty
    private DataData data;

    @JsonProperty
    private int count;

    @JsonProperty
    private String id;

    @JsonProperty
    private boolean hasRejectedComponents;

    @JsonProperty
    private String type;

}