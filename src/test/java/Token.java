import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {
    @JsonProperty("Key")
    public String Key;
    @JsonProperty("Url")
    public String Url;
}