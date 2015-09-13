import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RestTest {

  @Test
  public void test() {

    ClientConfig clientConfig = new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    Client client = Client.create(clientConfig);

    String getBookURL = "http://127.0.0.1:9000/api/problems";
    WebResource service = client.resource(getBookURL);
    ClientResponse response = service.get(ClientResponse.class);

    Problem[] problems = response.getEntity(Problem[].class);


    for (Problem problem : problems) {
      System.out.println(problem);
    }

    Assert.assertEquals(20, problems.length);
  }
}
