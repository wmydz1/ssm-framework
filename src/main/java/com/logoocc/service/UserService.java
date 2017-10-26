package com.logoocc.service;


import com.logoocc.dao.UserMapper;
import com.logoocc.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by ms-zk on 2017-03-15.
 */
public interface UserService {

    User selectByPrimaryKey(Integer id);


}
