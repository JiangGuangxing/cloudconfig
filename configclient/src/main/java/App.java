import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 姜广兴
 * @date 2018-05-14
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class App {
//    @Value("${config.name}")
//    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello ";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
