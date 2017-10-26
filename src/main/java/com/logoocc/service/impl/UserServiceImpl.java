package com.logoocc.service.impl;



import com.logoocc.dao.UserMapper;
import com.logoocc.model.User;
import com.logoocc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ms-zk on 2017-03-15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper usermapper;


    @Override
    public User selectByPrimaryKey(Integer id) {
        return usermapper.selectByPrimaryKey(id);
    }
}
