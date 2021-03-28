package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();// вывод
    void save(User user);//добавлять, сохранять
    void change(Long id, User user);//изменять
    void delete(Long id);//удалять
}
