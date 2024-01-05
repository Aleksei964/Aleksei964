package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.cleanUsersTable();
        userService.saveUser("Роман", "Васин", (byte) 42);
        userService.saveUser("Сергей", "Морозов", (byte) 54);
        userService.saveUser("Игорь", "Исаев", (byte) 59);
        userService.saveUser("Александр", "Васильев", (byte) 25);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
