package en.abramovskyi.spring.hibernate_test2;


import en.abramovskyi.spring.hibernate_test2.entity.Detail;
import en.abramovskyi.spring.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test11 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Nick", "Thomson",
//                    "IT", 5000);
//            Detail detail = new Detail("London", "+125497952",
//                    "nickthomson@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Sam", "Smith",
//                    "Sales", 4000);
//            Detail detail = new Detail("Paris", "+125654952",
//                    "samsmith@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            System.out.println(emp.getEmpDetail());


            session.getTransaction().commit();
            System.out.println("Done!");
        }

        finally {
            session.close();
            factory.close();
        }

    }
}

