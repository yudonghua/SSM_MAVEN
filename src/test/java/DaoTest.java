


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mvn_ssm.api.dao.DealerDOMapper;
import com.mvn_ssm.api.dao.IndexDOMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;


public class DaoTest {
    private ClassPathXmlApplicationContext context;
    private IndexDOMapper indexDOMapper;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("config/application-beans.xml");
        indexDOMapper = (IndexDOMapper)context.getBean("indexDOMapper");
    }


    //INSERT INTO USER_INFO VALUES(1,'admin','123','1986-11-24',1,20);
    @Test
    public void testItem(){
        JSONArray array = null;
        Map map = new HashMap();
        map.put("item_id","1");
        map.put("item_name","name");
        System.out.println(JSON.toJSONString(indexDOMapper.getMap(map)));
        System.out.println(JSON.toJSONString(indexDOMapper.getItem(1l)));

    }
}
