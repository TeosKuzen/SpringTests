package pro.chef.model.response.new_order;

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