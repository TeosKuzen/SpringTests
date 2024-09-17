package pro.chef.model.request.new_order;

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
public class Response implements Serializable {

    @JsonProperty
    private boolean digitalRecipe;

    @JsonProperty
    private boolean isNewCard;

    @JsonProperty
    private String deliveryTo;

    @JsonProperty
    private String addressId;

    @JsonProperty
    private String subscriptionName;

    @JsonProperty
    private List<DeliveryTimeItem> deliveryTime;

    @JsonProperty
    private Object gaUserId;

    @JsonProperty
    private Object subscriptionId;

    @JsonProperty
    private String deliveryDate;

    @JsonProperty
    private boolean isContactlessDelivery;

    @JsonProperty
    private String deliveryFrom;

    @JsonProperty
    private String basketId;

    @JsonProperty
    private int bonuses;

    @JsonProperty
    private String paymentTypeId;

}