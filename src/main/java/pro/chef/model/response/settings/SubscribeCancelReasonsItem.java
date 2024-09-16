package pro.chef.model.response.settings;

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
public class SubscribeCancelReasonsItem implements Serializable {

	@JsonProperty
	private boolean allowCustomComment;

	@JsonProperty
	private String name;

	@JsonProperty
	private String id;

	@JsonProperty
	private int sort;

}