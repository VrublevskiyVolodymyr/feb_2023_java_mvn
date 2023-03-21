package homework_1.actor;

import homework_1.actor.emtity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Actor.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Actor actor = new Actor( "vasya","petrov");

        session.save(actor);

//        Actor actor1 = session.find( Actor.class, 201L);
//        session.remove(actor1);

        Actor actor1 = session.find( Actor.class, 201L);
        actor1.setFirst_name("taras");
        session.update(actor1);

        session.getTransaction().commit();


        session
                .createQuery("select actor from Actor actor where actor.id>0", Actor.class)
                .getResultList()
                .forEach(System.out::println);
        session.close();
        sessionFactory.close();

    }
}
