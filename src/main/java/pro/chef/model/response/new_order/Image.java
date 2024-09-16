package pro.chef.model.response.new_order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Image implements Serializable {

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