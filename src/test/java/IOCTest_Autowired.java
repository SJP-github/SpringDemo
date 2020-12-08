import com.sjp.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IOCTest_Autowired {

    @Autowired(required = false)
    BookService bookService;

    @Test
    public void test() {

    }
}
