package dao;

import model.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery(" from User", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void change(Long id, String name, String lastName) {
        int result = entityManager.createQuery("update User set name = :name, lastName = :lastName " +
                "where id = :id")
                .setParameter("id", id)
                .setParameter("name", name)
                .setParameter("lastName", lastName)
                .executeUpdate();
    }

    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
}
