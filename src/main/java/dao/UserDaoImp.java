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
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void change(Long id, User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
