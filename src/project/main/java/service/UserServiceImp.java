package service;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional()
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional()
    public void change(Long id, String name, String lastName) {
        userDao.change(id, name, lastName);
    }

    @Override
    @Transactional()
    public void delete(Long id) {
        userDao.delete(id);
    }
}
