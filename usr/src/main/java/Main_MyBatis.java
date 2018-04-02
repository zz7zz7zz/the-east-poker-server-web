import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.poker.user.dao.IUserDao;
import com.poker.user.entity.User;

public class Main_MyBatis {
	
	public static void main(String argc[]){
		//io加载配置文件
        InputStream in = Main_MyBatis.class.getResourceAsStream("mybatis_config.xml");

       //用构建器构建一个inputstream
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        
      //取得mapper对象 调用mapper方法
        SqlSession session=factory.openSession();
        IUserDao mUserDao = session.getMapper(IUserDao.class);
        
        User user = new User();
        user.setUid(10008);
        user.setUuid("uuid"+user.getUid());
        user.setPassword("psd"+user.getUid());
        user.setName("name"+user.getUid());
        user.setPortrait("portrait"+user.getUid());
        user.setRegTime(System.currentTimeMillis());
        
        // 测试接口1
//        mUserDao.addUser(user);
        
        // 测试接口2
        User q_user = mUserDao.getUserByUuid("uuid10000");
        System.out.println(q_user);
        
        // 测试接口3
        User q_user_2 = mUserDao.getUserUid(10001);
        System.out.println(q_user_2);
        
       //记得提交 不提交等于啥都没干
        session.commit();
        //关闭资源
        session.close();
	}
}
