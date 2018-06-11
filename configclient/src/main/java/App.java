import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class App {
    @Value("${test}")
    private String name;
    @Value("${test2}")
    private String name2;

    @RequestMapping("/")
    public String home() {
        return "hello " + name + "-" + name2;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
