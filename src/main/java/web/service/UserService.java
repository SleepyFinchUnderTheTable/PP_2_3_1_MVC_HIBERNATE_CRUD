package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> listUsers();

    public void addOneUser(User user);

    public void deleteUserByID(int id);

    public void editUserDetails(User userFin, int id);

    public User getOneUser(int id);
}
