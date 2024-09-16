package pro.chef.model.response.new_address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Response {

    @JsonProperty
    private boolean isLastOrder;

    @JsonProperty
    private List<Object> subscriptions;

    @JsonProperty
    private Geopoint geopoint;

    @JsonProperty
    private String addressStr;

    @JsonProperty
    private int sort;

    @JsonProperty
    private Object isPickup;

    @JsonProperty
    private Object dadata;

    @JsonProperty
    private boolean isValidated;

    @JsonProperty
    private boolean jsonMemberDefault;

    @JsonProperty
    private String phone;

    @JsonProperty
    private Object name;

    @JsonProperty
    private Object intercom;

    @JsonProperty
    private Object comment;

    @JsonProperty
    private String id;

    @JsonProperty
    private Object entrance;

    @JsonProperty
    private Object floor;

    @JsonProperty
    private Object clientName;

    @JsonProperty
    private Object apartment;

}