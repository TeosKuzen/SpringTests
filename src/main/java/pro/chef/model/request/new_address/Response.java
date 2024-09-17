package pro.chef.model.request.new_address;

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
public class Response implements Serializable {

	@JsonProperty
	private boolean isGeopoint;

	@JsonProperty
	private String phone;

	@JsonProperty
	private String comment;

	@JsonProperty
	private Object lon;

	@JsonProperty
	private String addressStr;

	@JsonProperty
	private String entrance;

	@JsonProperty
	private Dadata dadata;

	@JsonProperty
	private String apartment;

	@JsonProperty
	private Object lat;

}