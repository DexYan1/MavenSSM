package com.yan.service.impl;

import com.yan.dao.UserDao;
import com.yan.domain.User;
import com.yan.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void save(User user) {
        userDao.save(user);
    }
}
