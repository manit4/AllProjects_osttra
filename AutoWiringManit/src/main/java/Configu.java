import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.manitt")
public class Configu {
	
	public Configu() {
		System.out.println("inside Config con");
	}

}
