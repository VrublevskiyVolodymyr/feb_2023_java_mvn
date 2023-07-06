package homework_1.city;

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
                .addAnnotatedClass(City.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        City city =new City("Dnipro", (short) 5);

        session.save(city);

//        City city1 = session.find( City.class, 601L);
//        session.remove(city1);

        City city1 = session.find( City.class, 600L);
        city1.setCity("Lviv");
        session.update(city1);

        session.getTransaction().commit();


        session
                .createQuery("select city from City city where city.city_id>0", City.class)
                .getResultList()
                .forEach(System.out::println);
        session.close();
        sessionFactory.close();
    }
}
