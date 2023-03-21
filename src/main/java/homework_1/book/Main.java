package homework_1.book;

import homework_1.book.emtity.Book;
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
                .addAnnotatedClass(Book.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Book book = new Book(7, "To Kill a Mockingbird");

        session.save(book);

//        Book book1 = session.find(Book.class, 7L);
//        session.remove(book1);

//        Book book1 = session.find(Book.class, 7L);
//        book1.setTitle("Taras");
//        session.update(book1);

        session.getTransaction().commit();


        session
                .createQuery("select book from Book book where book.id>0", Book.class)
                .getResultList()
                .forEach(System.out::println);
        session.close();
        sessionFactory.close();

    }
}
