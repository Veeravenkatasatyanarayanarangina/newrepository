package spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Bookshelf 
{
	public static void main(String[] args) {
		ApplicationContext context =  new FileSystemXmlApplicationContext ("D:/Myrepository/newrepository/springexample/src/spring.xml");
		Catogiry cat =(Catogiry)context.getBean("catagiry");
		System.out.println(cat.getCname()+"    "+cat.getGethanjali().getBid()+" "+cat.getGethanjali().getBname()+"  "+cat.getGethanjali().getPrice());
		
	}

}
