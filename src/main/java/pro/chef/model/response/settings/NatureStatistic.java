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
public class NatureStatistic implements Serializable {

	@JsonProperty("content_page_id")
	private String amountTreeSaves;

	@JsonProperty
	private String amountMonth;

	@JsonProperty
	private String amountAll;

}