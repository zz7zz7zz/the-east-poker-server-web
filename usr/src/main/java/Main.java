import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poker.user.login.ILoginService;

public class Main {
	
	public static void main(String argc[]){
		ApplicationContext mContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ILoginService login = (ILoginService) mContext.getBean("login");
		login.login();
		
		ILoginService login2 = (ILoginService) mContext.getBean("login2");
		login2.login();

	}
}
