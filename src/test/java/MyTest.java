import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.wang.dao.UserMapper;
import www.wang.pojo.Books;
import www.wang.pojo.User;
import www.wang.service.BookService;
import www.wang.service.UserServicesImpl;

public class MyTest {
   @Test
    public void test(){
       UserServicesImpl userServices = new UserServicesImpl();
       User admin = userServices.login("admin");
       System.out.println(admin);
   }
}
