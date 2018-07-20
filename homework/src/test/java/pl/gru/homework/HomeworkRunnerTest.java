package pl.gru.homework;

import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDateTime;

public class HomeworkRunnerTest extends TestCase {
    private SessionFactory sessionFactory;


    @Override
    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @Override
    protected void tearDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void testHomework() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Coach c1 = new Coach ("coach1Name", "coach1Surname", LocalDateTime.of(1980, 1, 30, 15, 12));
        Coach c2 = new Coach ("coach2Name", "coach2Surname", LocalDateTime.of(1975, 3, 12, 9, 8));






    }



}
