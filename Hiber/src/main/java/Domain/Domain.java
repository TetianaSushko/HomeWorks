package Domain;

import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Address address = new Address();
        address.setCountry("UA");
        address.setCity("Kyiv");
        address.setStreet("Volunska");
        address.setPostCode("300387");

        Project project = new Project();
        project.setTitle("firstTitle");

        Employee employee = new Employee();
        employee.setFirstName("anna");
        employee.setLastName("oland");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);


        Set<Employee> employees = new HashSet<>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<>();
        projects.add(project);
        employee.setProjects(projects);

        session.save(address);
        session.save(project);
        session.save(employee);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
