package pro.chef.model.request.new_order;

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
public class DeliveryTimeItem {

    @JsonProperty
    private boolean active;

    @JsonProperty
    private String from;

    @JsonProperty
    private String to;

}