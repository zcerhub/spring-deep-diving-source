package com.zchuber.springsourcedeepdiving.jdbc;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {

    void save(User user);

    List<User> getUsers();

}
