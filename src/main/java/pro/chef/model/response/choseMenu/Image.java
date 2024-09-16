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
public class Image {

	@JsonProperty
	private Object chefId;

	@JsonProperty
	private Object fileName;

	@JsonProperty
	private String name;

	@JsonProperty
	private String link;

	@JsonProperty
	private Object width;

	@JsonProperty
	private String id;

	@JsonProperty
	private String type;

	@JsonProperty
	private Object parentImageId;

	@JsonProperty
	private Object height;

}