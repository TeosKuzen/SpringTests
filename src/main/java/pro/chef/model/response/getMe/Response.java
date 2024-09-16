package pro.chef.model.response.getMe;

import java.util.List;

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
public class Response {

    @JsonProperty
    private Object firstOrderAt;

    @JsonProperty
    private List<Object> addresses;

    @JsonProperty
    private boolean digitalRecipe;

    @JsonProperty
    private String gender;

    @JsonProperty
    private int nextStatusPercent;

    @JsonProperty
    private Bonus bonus;

    @JsonProperty
    private String dateOfBirth;

    @JsonProperty
    private List<PhonesItem> phones;

    @JsonProperty
    private boolean isContactlessDelivery;

    @JsonProperty
    private List<Object> balanceTransactions;

    @JsonProperty
    private boolean isPromoGiftEnabled;

    @JsonProperty
    private boolean hasActiveOrder;

    @JsonProperty
    private boolean hasActivePromoSetOrder;

    @JsonProperty
    private String id;

    @JsonProperty
    private int lifetimeOrdersCount;

    @JsonProperty
    private Object firstName;

    @JsonProperty
    private int lastBonusNotificationAmount;

    @JsonProperty
    private Object email;

    @JsonProperty
    private int nextStatusOrdersAmount;

    @JsonProperty
    private Object image;

    @JsonProperty
    private List<Object> preferences;

    @JsonProperty
    private List<Object> bankCards;

    @JsonProperty
    private boolean hasActiveSubscription;

    @JsonProperty
    private Object lastName;

    @JsonProperty
    private String addCardLink;

    @JsonProperty
    private int cashbackLifetime;

    @JsonProperty
    private int maxStatusPercent;

    @JsonProperty
    private boolean hasAnyDeliveredOrder;

    @JsonProperty
    private int ordersCount;

    @JsonProperty
    private boolean hasEditableOrder;

    @JsonProperty
    private Referral referral;

    @JsonProperty
    private int chefId;

    @JsonProperty
    private boolean hasCashback;

    @JsonProperty
    private String phone;

    @JsonProperty
    private boolean noOrders;

    @JsonProperty
    private boolean has_delivered_mealkit_order;

    @JsonProperty
    private Status status;

}