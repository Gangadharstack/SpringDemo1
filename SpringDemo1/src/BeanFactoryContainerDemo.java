import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import mypack.Employee;

public class BeanFactoryContainerDemo
{
	 public static void main(String args[])
	 {
		 Resource resource=new ClassPathResource("SpringConfig.xml");
         BeanFactory factory=new XmlBeanFactory(resource);
		 
		 Employee employeeBean=(Employee)factory.getBean("empBean");
		 employeeBean.displayEmpDetails();
		 
		 
		
	 }

}
