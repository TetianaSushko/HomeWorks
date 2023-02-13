import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
public class StudentServiceImpl implements StudentService {
    @Override
    public boolean addStudent(Student student) {
        Session session = HibernateService.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Student> getAll() {
        List<Student> result;
        try {
            Session session = HibernateService.getSessionFactory().openSession();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> rootEntry = cq.from(Student.class);
            CriteriaQuery<Student> all = cq.select(rootEntry);
            TypedQuery<Student> allQuery = session.createQuery(all);
            result = allQuery.getResultList();
            session.close();
            return result;
        } catch (Exception e) {
            System.out.println("ERROR FOR GET ALL");
            HibernateService.shutdown();
            return null;
        }
    }
    @Override
    public List<Student> getByName(String name) {
        List<Student> result;
        try {
            Session session = HibernateService.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Student.class);
            criteria.add(Restrictions.eq("name", name));
            result = (List<Student>) criteria.list();
            session.close();
            return result;
        } catch (Exception e) {
            System.err.println("ERROR GET BY NAME");
            return null;
        }
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) {
        List<Student> result = new ArrayList<>();
        try {
            Session session = HibernateService.getSessionFactory().openSession();
            for (long id : ids) {
                Student s = session.get(Student.class, id);
                if (s != null) {
                    result.add(s);
                }
            }
            session.close();
            return result;
        } catch (Exception e) {
            System.out.println("ERROR FOR GET BY ID");
            HibernateService.shutdown();
            return null;
        }
    }
}
