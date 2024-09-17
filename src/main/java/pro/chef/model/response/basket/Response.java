package pro.chef.model.response.basket;

import java.io.Serializable;
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
public class Response implements Serializable {

	@JsonProperty
	private int subscriptionDiscountAmount;

	@JsonProperty
	private List<Object> basketItems;

	@JsonProperty
	private Object coupon;

	@JsonProperty
	private boolean isSubscription;

	@JsonProperty
	private Object giftId;

	@JsonProperty
	private int leftToFreeDelivery;

	@JsonProperty
	private int readyPriceWoDiscounts;

	@JsonProperty
	private boolean isPromo;

	@JsonProperty
	private int priceWoDiscount;

	@JsonProperty
	private int readyPrice;

	@JsonProperty
	private Object couponStatus;

	@JsonProperty
	private int deliveryCost;

	@JsonProperty
	private boolean isCouponAllowed;

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
	private int subscriptionDiscountPercent;

	@JsonProperty
	private Object holidayType;

	@JsonProperty
	private int priceTotal;

}