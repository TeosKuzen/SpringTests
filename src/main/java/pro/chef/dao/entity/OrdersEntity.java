package pro.chef.dao.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table(schema = "be", name = "orders")
@Table(name = "orders")
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    
    @Column(name = "chef_id", nullable = false)
    private Integer chefId;

    
    @Column(name = "client_id", nullable = false)
    private UUID clientId;

    
    @Column(name = "basket_id", nullable = false)
    private UUID basketId;

    
    @Column(name = "subscription_id")
    private UUID subscriptionId;

    
    @Column(name = "chef_schedule_item_id")
    private Integer chefScheduleItemId;

    
    @Column(name = "payment_type_id", nullable = false)
    private UUID paymentTypeId;

    
    @Column(name = "bank_card_id")
    private UUID bankСardId;

   
    @Column(name = "status_id", nullable = false)
    private UUID statusId;

  
    @Column(name = "cancel_type_id", nullable = false)
    private UUID cancelTypeId;

    
    @Column(name = "delivery_type_id", nullable = false)
    private UUID deliveryTypeId;

    
    @Column(name = "is_paid", nullable = false)
    private Boolean isPaid;

    
    @Column(name = "bonuses", nullable = false)
    private Integer bonuses;

    
    @Column(name = "coupon", nullable = false)
    private String coupon;

    
    @Column(name = "subscribe_order", nullable = false)
    private Boolean subscribeOrder;

    
    @Column(name = "price", nullable = false)
    private Double price;

    
    @Column(name = "price_wo_discount", nullable = false)
    private Double priceWoDiscount;

    
    @Column(name = "delivery_from", nullable = false)
    private LocalDateTime deliveryFrom;

    
    @Column(name = "delivery_to", nullable = false)
    private LocalDateTime deliveryTo;

    
    @Column(name = "address_id", nullable = false)
    private UUID addressId;

    
    @Column(name = "delivery_address", nullable = false)
    private String deliveryAddress;

    
    @Column(name = "score", nullable = false)
    private Integer score;

    
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    
    @Column(name = "delivery_cost", nullable = false)
    private Double deliveryCost;

    
    @Column(name = "year", nullable = false)
    private Integer year;

    
    @Column(name = "week", nullable = false)
    private Integer week;

    
    @Column(name = "day", nullable = false)
    private Integer day;

    
    @Column(name = "time_from", nullable = false)
    private String timeFrom;

    
    @Column(name = "time_to", nullable = false)
    private String timeTo;

    
    @Column(name = "chef_schedule_item_status")
    private Integer chefScheduleItemStatus;

    
    @Column(name = "is_constructed", nullable = false)
    private Boolean isConstructed;

    
    @Column(name = "ready_order", nullable = false)
    private Boolean readyOrder;

    
    @Column(name = "cashback_amount", nullable = false)
    private Double cashbackAmount;

    
    @Column(name = "is_contactless_delivery", nullable = false)
    private Boolean isContactlessDelivery;

    
    @Column(name = "payment_errors_count", nullable = false)
    private Integer paymentErrorsCount;

    
    @Column(name = "delivered_time", nullable = false)
    private LocalDateTime deliveredTime;

    
    @Column(name = "chef_subscribe_id")
    private Integer chefSubscribeId;

    
    @Column(name = "ym_client_uid")
    private Integer ymClientUid;

    
    @Column(name = "delivery_time", nullable = false)
    private String deliveryTime;

    
    @Column(name = "chef_subscribe_name", nullable = false)
    private String chefSubscribeName;

    
    @Column(name = "border_date")
    private LocalDateTime borderDate;

    
    @Column(name = "aeroflot_identifier")
    private Integer aeroflotIdentifier;

    
    @Column(name = "digital_recipe", nullable = false)
    private Boolean digitalRecipe;

}
