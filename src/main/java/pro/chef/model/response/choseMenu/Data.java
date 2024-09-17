package pro.chef.model.response.choseMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
public class Data implements Serializable {

    @JsonProperty
    private Image image;

    @JsonProperty
    private boolean selfmake;

    @JsonProperty
    private int week;

    @JsonProperty
    private int year;

    @JsonProperty
    private String weekId;

    @JsonProperty
    private String menuTypeId;

    @JsonProperty
    private Object replacementForTypeId;

    @JsonProperty
    private List<Object> dishes;

    @JsonProperty
    private Serving serving;

    @JsonProperty
    private boolean isConstructed;

    @JsonProperty
    private int price;

    @JsonProperty
    private String deliveryFrom;

    @JsonProperty
    private int days;

    @JsonProperty
    private String id;

    @JsonProperty
    private String menuTypeName;

    @JsonProperty
    private boolean isGift;

    @JsonProperty
    private Object rate;

    @JsonProperty
    private String name;

}