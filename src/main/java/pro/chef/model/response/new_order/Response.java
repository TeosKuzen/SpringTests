package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Response implements Serializable {

    @JsonProperty
    private Basket basket;

    @JsonProperty
    private BankCard bankCard;

    @JsonProperty
    private String notEditableTooltipFull;

    @JsonProperty
    private int week;

    @JsonProperty
    private String commonStatus;

    @JsonProperty
    private boolean digitalRecipe;

    @JsonProperty
    private boolean isSubscription;

    @JsonProperty
    private boolean isEstimated;

    @JsonProperty
    private Object subscriptionName;

    @JsonProperty
    private Object cancelType;

    @JsonProperty
    private String notEditableTooltip;

    @JsonProperty
    private Object subscriptionId;

    @JsonProperty
    private Object score;

    @JsonProperty
    private List<Object> discounts;

    @JsonProperty
    private Object isReady;

    @JsonProperty
    private int cashbackAmount;

    @JsonProperty
    private boolean isContactlessDelivery;

    @JsonProperty
    private int price;

    @JsonProperty
    private String id;

    @JsonProperty
    private boolean isPaid;

    @JsonProperty
    private int bonuses;

    @JsonProperty
    private boolean isActiveSubscription;

    @JsonProperty
    private String paymentTypeId;

    @JsonProperty
    private Object paymentDate;

    @JsonProperty
    private Delivery delivery;

    @JsonProperty
    private Address address;

    @JsonProperty
    private boolean isActive;

    @JsonProperty
    private int statusChefId;

    @JsonProperty
    private boolean isEditable;

    @JsonProperty
    private String editableTo;

    @JsonProperty
    private int priceWoDiscount;

    @JsonProperty
    private boolean isExecuted;

    @JsonProperty
    private String paymentType;

    @JsonProperty
    private String orderContent;

    @JsonProperty
    private int chefId;

    @JsonProperty
    private boolean isRated;

    @JsonProperty
    private String toggleTooltip;

    @JsonProperty
    private boolean isToggleable;

    @JsonProperty
    private String status;

}