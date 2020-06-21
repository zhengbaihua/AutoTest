import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zbh
 * @date 2020/6/20 16:52
 */

@SpringBootApplication
@ComponentScan("com.course")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
