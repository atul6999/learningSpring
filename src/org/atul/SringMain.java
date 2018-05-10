/**
 * 
 */
package org.atul;

import org.atul.dao.Shape;
import org.atul.repository.JdbcDaoImpl;
//import org.atul.model.Triangle;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 * @author atmishra
 *
 */
public class SringMain {

	private static ApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring.xml");
//		Shape shape = (Shape)context.getBean("shape");
//		shape.draw();
//		System.out.println(shape.toString());
		JdbcDaoImpl jdbcDaoImpl = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		jdbcDaoImpl.getCircle(1).getId();
	}
}
