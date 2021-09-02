package en.abramovskyi.spring.hibernate_test;

import en.abramovskyi.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp1 = new Employee("Mike", "Tyson", "IT",
                    5000);
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
        }

        finally {
            factory.close();
        }

    }
}
