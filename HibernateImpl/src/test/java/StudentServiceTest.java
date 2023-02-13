import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StudentServiceTest{
    private static SessionFactory sessionFactory = null;
    private static Student testStudent = new Student("test", 1990, 2);

    @Test
    public void getAll() {
        StudentService studentService = new StudentServiceImpl();
        List<Student> students = studentService.getAll();
        Session session = sessionFactory.openSession();
        studentService.addStudent(testStudent);
        Assertions.assertEquals(58, students.size());
        session.beginTransaction();
        session.delete( testStudent );
        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void getByName() {
        StudentService service = new StudentServiceImpl();
        Session session = sessionFactory.openSession();
        service.addStudent(testStudent);
        Assert.assertEquals(9, service.getByName("inna").size());
        session.beginTransaction();
        session.delete( testStudent );
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void getByIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(10);
        StudentService service = new StudentServiceImpl();
        assertEquals(1, service.getByIds(ids).size());
    }
    @BeforeEach
    public void setSessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    @AfterEach
    public void shutDown() {
        sessionFactory.close();
    }
}