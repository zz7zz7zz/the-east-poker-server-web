import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.poker.user.dao.IUserDao;
import com.poker.user.entity.User;

public class Main_MyBatis {
	
	public static void main(String argc[]){
		//io���������ļ�
        InputStream in = Main_MyBatis.class.getResourceAsStream("mybatis_config.xml");

       //�ù���������һ��inputstream
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        
      //ȡ��mapper���� ����mapper����
        SqlSession session=factory.openSession();
        IUserDao mUserDao = session.getMapper(IUserDao.class);
        
        User user = new User();
        user.setUid(10008);
        user.setUuid("uuid"+user.getUid());
        user.setPassword("psd"+user.getUid());
        user.setName("name"+user.getUid());
        user.setPortrait("portrait"+user.getUid());
        user.setRegTime(System.currentTimeMillis());
        
        // ���Խӿ�1
//        mUserDao.addUser(user);
        
        // ���Խӿ�2
        User q_user = mUserDao.getUserByUuid("uuid10000");
        System.out.println(q_user);
        
        // ���Խӿ�3
        User q_user_2 = mUserDao.getUserUid(10001);
        System.out.println(q_user_2);
        
       //�ǵ��ύ ���ύ����ɶ��û��
        session.commit();
        //�ر���Դ
        session.close();
	}
}
