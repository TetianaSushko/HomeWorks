import org.hibernate.SessionFactory;


public class SessionExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory =HibernateService.getSessionFactory();
        String s = sessionFactory.getCurrentSession().toString();

    }
}
