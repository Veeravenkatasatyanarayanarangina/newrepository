package spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class TravelMain
{
	 public static void main(String[] args) {
		 ApplicationContext context =  new FileSystemXmlApplicationContext ("D:/Myrepository/newrepository/springexample/src/spring.xml");
			
			Journy parris = (Journy)context.getBean("parris");
			parris.startJourny();
			
	}

}
