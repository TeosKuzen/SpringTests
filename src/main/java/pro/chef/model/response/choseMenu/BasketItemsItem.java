package pro.chef.model.response.choseMenu;

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
public class BasketItemsItem {

	@JsonProperty
	private boolean hasPreferredComponents;

	@JsonProperty
	private Data data;

	@JsonProperty
	private int count;

	@JsonProperty
	private String id;

	@JsonProperty
	private boolean hasRejectedComponents;

	@JsonProperty
	private String type;

}