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
public class Basket implements Serializable {

    @JsonProperty
    private int subscriptionDiscountAmount;

    @JsonProperty
    private List<BasketItemsItem> basketItems;

    @JsonProperty
    private boolean isGuest;

    @JsonProperty
    private boolean isSubscription;

    @JsonProperty
    private Object externalId;

    @JsonProperty
    private int readyPriceWoDiscounts;

    @JsonProperty
    private boolean isPromo;

    @JsonProperty
    private String clientId;

    @JsonProperty
    private String currentType;

    @JsonProperty
    private int deliveryCost;

    @JsonProperty
    private List<Object> discounts;

    @JsonProperty
    private String updatedAt;

    @JsonProperty
    private int price;

    @JsonProperty
    private String basketJwt;

    @JsonProperty
    private Object isOnlyCardPayments;

    @JsonProperty
    private String id;

    @JsonProperty
    private boolean isOrdered;

    @JsonProperty
    private Object coupon;

    @JsonProperty
    private boolean isClientUsableBasket;

    @JsonProperty
    private Object giftId;

    @JsonProperty
    private int leftToFreeDelivery;

    @JsonProperty
    private int priceWoDiscount;

    @JsonProperty
    private int readyPrice;

    @JsonProperty
    private Object couponStatus;

    @JsonProperty
    private boolean isCouponAllowed;

    @JsonProperty
    private int subscriptionDiscountPercent;

    @JsonProperty
    private Object holidayType;

}