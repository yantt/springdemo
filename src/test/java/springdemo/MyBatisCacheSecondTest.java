package springdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zwtxsy.entity.vo.User;
import com.zwtxsy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext.xml"})  
public class MyBatisCacheSecondTest 
{
    private static final Logger logger = LoggerFactory.getLogger(MyBatisCacheSecondTest.class);    

    @Autowired
    private  UserService userService;

    /*
     * 二级缓存测试
     */
    @Test
    public void testCache2() {
        String userName = userService.selectUserName();
        System.out.println(userName);
 
        String userName2 = userService.selectUserName();
        System.out.println(userName);
       
    }   

}
