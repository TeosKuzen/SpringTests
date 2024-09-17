package pro.chef.model.response.new_order;

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
public class Address implements Serializable {

    @JsonProperty
    private boolean isLastOrder;

    @JsonProperty
    private List<Object> subscriptions;

    @JsonProperty
    private Geopoint geopoint;

    @JsonProperty
    private int chefRegionId;

    @JsonProperty
    private String addressStr;

    @JsonProperty
    private int sort;

    @JsonProperty
    private boolean isPickup;

    @JsonProperty
    private String dadata;

    @JsonProperty
    private boolean isValidated;

    @JsonProperty
    private String clientId;

    @JsonProperty
    private boolean jsonMemberDefault;

    @JsonProperty
    private Object isDeleted;

    @JsonProperty
    private boolean isGeopoint;

    @JsonProperty
    private int chefId;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String name;

    @JsonProperty
    private String intercom;

    @JsonProperty
    private String comment;

    @JsonProperty
    private String id;

    @JsonProperty
    private String entrance;

    @JsonProperty
    private String floor;

    @JsonProperty
    private String clientName;

    @JsonProperty
    private int chefZoneId;

    @JsonProperty
    private String apartment;

}