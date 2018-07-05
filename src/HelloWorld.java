import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//The Java class will be hosted at the URI
@Path("/helloworld")

public class HelloWorld {
    //The Java method will process HTTP GET Requests
    @GET
    //The Java method will produce content
    @Produces("text/plain")

    public String getClinchedMessage() {
        //Return some clinched textual cont
        return "Chairboys Sky Blue Army!";
    }

}
