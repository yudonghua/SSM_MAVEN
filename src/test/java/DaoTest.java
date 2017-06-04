


import com.mvn_ssm.api.dao.DealerDOMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;


public class DaoTest {
    private ClassPathXmlApplicationContext context;
    private DealerDOMapper dealerDOMapper;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("config/application-beans.xml");
        dealerDOMapper = (DealerDOMapper)context.getBean("dealerDOMapper");
    }


    //INSERT INTO USER_INFO VALUES(1,'admin','123','1986-11-24',1,20);
    @Test
    public void testItem(){
        System.out.println(dealerDOMapper.getDealerByUsername("Logintest").getDealerPassword());
    }
}
