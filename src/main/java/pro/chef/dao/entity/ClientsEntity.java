package pro.chef.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
//@Table(schema = "public", name = "clients")
@Table(name = "clients")
public class ClientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "chef_id")
    private Integer chefId;

    @Column(name = "referral_code")
    private String referralCode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private ZonedDateTime dateOfBirth;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "gender")
    private String gender;

    @Column(name = "current_bonus")
    private Integer currentBonus;

    @Column(name = "total_bonus")
    private Integer totalBonus;

    @Column(name = "client_status_id")
    private UUID clientStatusId;

    @Column(name = "chef_referral_client_id")
    private Integer chefReferralClientId;

    @Column(name = "usable_basket_id")
    private UUID usableBasketId;

    @Column(name = "temporary_basket_id")
    private UUID temporaryBasketId;

    @Column(name = "last_order_day_count")
    private Integer lastOrderDayCount;

    @Column(name = "has_cashback")
    private boolean hasCashback;

    @Column(name = "has_active_order")
    private boolean hasActiveOrder;

    @Column(name = "has_active_subscription")
    private boolean hasActiveSubscription;

    @Column(name = "last_bonus_notification_received")
    private ZonedDateTime lastBonusNotificationReceived;

    @Column(name = "has_active_promo_set_order")
    private boolean hasActivePromoSetOrder;

    @Column(name = "has_delivered_mealkit_order")
    private boolean hasDeliveredMealkitOrder;

    @Column(name = "image_id")
    private UUID imageId;

    @Column(name = "is_promo_gift_enabled")
    private boolean isPromoGiftEnabled;

    @Column(name = "has_any_delivered_order")
    private boolean hasAnyDeliveredOrder;

    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "has_orders_to_rate")
    private boolean hasOrdersToRate;

    @Column(name = "deleted_at")
    private ZonedDateTime deletedAt;

    @Column(name = "delete_platform")
    private String deletePlatform;

    @Column(name = "first_order_at")
    private ZonedDateTime firstOrderAt;

    @Column(name = "session_reset_at")
    private ZonedDateTime sessionResetAt;

    @Column(name = "is_contactless_delivery")
    private boolean isContactlessDelivery;

}
