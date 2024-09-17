package pro.chef.model.request.choseMenu;

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
public class MenuRequest implements Serializable {

	@JsonProperty
	private int week;

	@JsonProperty
	private int year;

	@JsonProperty
	private String menuTypeId;

	@JsonProperty
	private int days;

	@JsonProperty
	private int serving;

}