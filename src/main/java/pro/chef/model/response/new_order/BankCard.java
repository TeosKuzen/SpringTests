package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
public class BankCard implements Serializable {

    @JsonProperty
    private String cardHolder;

    @JsonProperty
    private boolean jsonMemberDefault;

    @JsonProperty
    private String expireDate;

    @JsonProperty
    private boolean isActive;

    @JsonProperty
    private String cardNumber;

    @JsonProperty
    private String id;

    @JsonProperty
    private Object sort;

    @JsonProperty
    private String title;

    @JsonProperty
    private int bankAcquiringId;

}