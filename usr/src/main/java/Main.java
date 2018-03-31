import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poker.user.service.IUserService;

public class Main {
	
	public static void main(String argc[]){
		ApplicationContext mContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserService login = (IUserService) mContext.getBean("login");
		login.login();
		
		IUserService login2 = (IUserService) mContext.getBean("login2");
		login2.login();

	}
}
