import com.sjp.bean.Person;
import com.sjp.config.MainConfigOfPropertiesValue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class IOCTest_PropertiesValue {

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertiesValue.class);

    @Test
    public void test01() {
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickname");
        System.out.println(property);
    }
}
