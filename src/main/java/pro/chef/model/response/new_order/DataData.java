package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataData implements Serializable {

    @JsonProperty
    private Object image;

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
    private List<DishesItem> dishes;

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

}