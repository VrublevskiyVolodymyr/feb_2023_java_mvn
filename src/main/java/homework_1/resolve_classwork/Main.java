package homework_1.resolve_classwork;



import homework_1.resolve_classwork.entity.Gender;
import homework_1.resolve_classwork.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(User.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("html");
        User user = new User("petya", skills, Gender.MALE);
//
        session.save(user);
        session.getTransaction().commit();
//        session
//                .createQuery("select user from User user where user.id>0", User.class)
//                .getResultList()
//                .forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
