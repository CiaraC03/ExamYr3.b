package ie.atu.examyr3customerservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("customerId")
    private int customerId;
    @JsonProperty("name")
    private int name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("email")
    private int email;

}
