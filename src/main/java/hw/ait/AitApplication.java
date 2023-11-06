package hw.ait;

import hw.ait.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AitApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AitApplication.class, args);
        Student student = applicationContext.getBean(Student.class);

        System.out.println("\nNew config with annotations:");
        System.out.println(student);

        applicationContext = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        student = (Student) applicationContext.getBean("student");
        System.out.println("\nOld config with .xml file:");
        System.out.println(student);
    }

}
