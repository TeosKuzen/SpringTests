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
public class DishesItem implements Serializable {

    @JsonProperty
    private boolean isSpicy;

    @JsonProperty
    private String dishId;

    @JsonProperty
    private Image image;

    @JsonProperty
    private Object hasPreferredComponents;

    @JsonProperty
    private int rate;

    @JsonProperty
    private String name;

    @JsonProperty
    private int count;

    @JsonProperty
    private String id;

    @JsonProperty
    private Object hasRejectedComponents;

    @JsonProperty
    private Serving serving;

}