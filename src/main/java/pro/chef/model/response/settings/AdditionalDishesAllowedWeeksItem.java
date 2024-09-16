package pro.chef.model.response.settings;

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
public class AdditionalDishesAllowedWeeksItem implements Serializable {

    @JsonProperty
    private int number;

    @JsonProperty
    private int year;

    @JsonProperty
    private boolean allowed;

    @JsonProperty("date_to")
    private String dateTo;

    @JsonProperty("date_from")
    private String dateFrom;

}