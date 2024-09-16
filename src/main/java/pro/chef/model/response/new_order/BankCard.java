package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
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