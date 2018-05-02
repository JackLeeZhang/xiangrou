package net.xiangrou.web.service;

import net.xiangrou.web.model.User;

import java.util.List;

/**
 * Created by apple on 2018/5/1.
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
