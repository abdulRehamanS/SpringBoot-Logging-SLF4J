package In.Abdul.SpringBootLoggingSLF4J.Controller;


import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    // creating a logger class
    Logger logger=LoggerFactory.getLogger(controller.class);

    @GetMapping("/test/{name}")
    public  String getName(@PathVariable String name) {
        logger.debug("Request {}",name);
        if (name.equalsIgnoreCase("test")){
            throw new RuntimeException("Oops Exception has Occurred");
        }
        String response= "Hi"+name+"Welcome to SpringBoot Logging System";
        logger.debug("Response {}",response);
        return response;
    }

}
