import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.servlet.UserServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/17 11:50
 * @description
 */
public class TestProject {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServlet userServlet = ac.getBean("userServlet", UserServlet.class);
        userServlet.addUser(new User("张三","123"));
    }

}
