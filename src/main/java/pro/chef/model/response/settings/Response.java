package pro.chef.model.response.settings;

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
    private NatureStatistic natureStatistic;

    @JsonProperty
    private List<HelpPagesItem> helpPages;

    @JsonProperty
    private List<Integer> billTypes;

    @JsonProperty
    private List<SubscribeCancelReasonsItem> subscribeCancelReasons;

    @JsonProperty
    private int soldPortionsCount;

    @JsonProperty
    private String platform;

    @JsonProperty
    private String defaultCityId;

    @JsonProperty
    private CurrentWeek currentWeek;

    @JsonProperty
    private Object averageDishRating;

    @JsonProperty
    private List<FaqItem> faq;

    @JsonProperty
    private List<Object> selfDeliveryAddresses;

    @JsonProperty
    private List<AdditionalDishesAllowedWeeksItem> additionalDishesAllowedWeeks;

    @JsonProperty
    private int selfDeliveryMinPrice;

    @JsonProperty
    private int subscriptionDiscount;

}