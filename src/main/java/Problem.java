import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Problem {
  @JsonProperty("_id")
  String id;
  @JsonProperty
  String name;
  @JsonProperty
  String className;
  @JsonProperty
  String defaultCode;
  @JsonProperty
  String description;
  @JsonProperty
  boolean published;
  @JsonProperty
  String groupId;

  @Override
  public String toString() {
    return "Problem{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", className='" + className + '\'' +
        ", defaultCode='" + defaultCode + '\'' +
        ", description='" + description + '\'' +
        ", published=" + published +
        ", groupId='" + groupId + '\'' +
        '}';
  }
}
