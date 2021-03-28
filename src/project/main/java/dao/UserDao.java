package dao;

import model.User;

import java.util.List;

public interface UserDao {//выводить, добавлять, удалять и изменять юзера
    List<User> getAllUsers();// вывод
    void save(User user);//добавлять, сохранять
    void change(Long id, String name, String lastName);//изменять
    void delete(Long id);//удалять
}
