package pro.chef.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
//@Table(schema = "public", name = "baskets")
@Table(name = "baskets")
public class BasketsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "is_guest")
    private boolean isGuest;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "is_subscribe_needed")
    private boolean isSubscribeNeeded;

    @Column(name = "price_wo_discount", precision = 8, scale = 2)
    private BigDecimal priceWoDiscount;

    @Column(name = "price", precision = 8, scale = 2)
    private BigDecimal price;

    @Column(name = "is_ordered")
    private boolean isOrdered;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "coupon")
    private String coupon;

    @Column(name = "coupon_status")
    private boolean couponStatus;

    @Column(name = "is_subscription")
    private boolean isSubscription;

    @Column(name = "is_client_usable_basket")
    private boolean isClientUsableBasket;

    @Column(name = "current_type")
    private String currentType;

    @Column(name = "external_id")
    private UUID externalId;

    @Column(name = "ready_price", columnDefinition = "float8")
    private Double readyPrice;

    @Column(name = "ready_price_wo_discounts", columnDefinition = "float8")
    private Double readyPriceWoDiscounts;

    @Column(name = "gift_id")
    private String giftId;

    @Column(name = "basket_items", columnDefinition = "json")
    private String basketItems;

    @Column(name = "discounts", columnDefinition = "json")
    private String discounts;

}
