package pro.chef.model.response.pincode;

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
public class PinCodeResponse implements Serializable {

    @JsonProperty
    private String success;

    @JsonProperty
    private String locked;

    @JsonProperty("time_out")
    private String timeOut;


}
