package homework_2;


import homework_2.entity.Car;
import homework_2.entity.CarType;
import homework_2.entity.DriveLicense;
import homework_2.entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(DriveLicense.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Car car1 = new Car("Civic", CarType.SEDAN, 140, 20000, 2020);
        Car car2 = new Car("CR-V", CarType.SUV, 190, 30000, 2021);
        Car car3 = new Car("Tacoma", CarType.TRUCK, 280, 35000, 2019);
        Car car4 = new Car("GT-R", CarType.SPORTS, 570, 120000, 2022);
        Car car5 = new Car("Model S", CarType.SEDAN, 670, 80000, 2021);
        Car car6 = new Car("Dodge Ram", CarType.VAN, 850, 110000, 2000);

//        session.persist(car1);
//        session.persist(car2);
//        session.persist(car3);
//        session.persist(car4);
//        session.persist(car5);
//        session.persist(car6);

        Owner owner1 = new Owner("John", Arrays.asList(car1, car2), new DriveLicense("AB123456"));
        Owner owner2 = new Owner("Jane", Arrays.asList(car3, car4), new DriveLicense("CD654321"));
        Owner owner3 = new Owner("Bob", Arrays.asList(car1, car5), new DriveLicense("EF987654"));
        Owner owner4 = new Owner("Alice", Arrays.asList(car3, car6), new DriveLicense("GH246810"));
        Owner owner5 = new Owner("David", Arrays.asList(car2, car4), new DriveLicense("IJ135790"));

//        session.persist(owner1);
//        session.persist(owner2);
//        session.persist(owner3);
//        session.persist(owner4);
//        session.persist(owner5);
////
//        Owner owner3 = session.find(Owner.class, 3);

//        Car car5 = session.find(Car.class, 5);
//        Car car6 = session.find(Car.class, 6);
//            owner3.getCars().add(car5);
//             owner3.getCars().add(car6);

        session.getTransaction().commit();

        session
                .createQuery("select owner.cars from Owner owner where owner.id>0", Car.class)
                .getResultList()
                .forEach(System.out::println);

        Owner owner = session.find(Owner.class, 3);
        System.out.println(owner);

        session.close();
        sessionFactory.close();

    }
}
