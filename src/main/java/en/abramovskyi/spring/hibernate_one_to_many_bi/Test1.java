package en.abramovskyi.spring.hibernate_one_to_many_bi;


import en.abramovskyi.spring.hibernate_one_to_many_bi.entity.Department;
import en.abramovskyi.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

//        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("IT",
//                    3000, 1200);
//            Employee emp1 = new Employee("Nick", "Peterson"
//                    , 8000);
//            Employee emp2 = new Employee("Kate", "Gallaher"
//                    , 5000);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(department);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }
//
//        finally {
//            session.close();
//            factory.close();
//        }
//

//        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//
//
//            session.beginTransaction();
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }
//
//        finally {
//            session.close();
//            factory.close();
//        }


//        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//
//            session.beginTransaction();
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }
//
//        finally {
//            session.close();
//            factory.close();
//        }

//********************************************/

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);

            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }

        finally {
            session.close();
            factory.close();
        }


    }
}

