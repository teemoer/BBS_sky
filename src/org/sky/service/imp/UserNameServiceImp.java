package org.sky.service.imp;

import org.sky.dao.UserNameDao;
import org.sky.entity.Result;
import org.sky.entity.UserName;
import org.sky.service.UserNameService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import javax.websocket.Session;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
@Service
@Transactional
public class UserNameServiceImp implements UserNameService {
    @Resource
    private  UserNameDao und;

    public UserName checkLogin(
            String name, String password) {

        Result result = new Result();
        UserName userName=und.findByName(name);
        if(userName == null){
            return userName;
        }
        if(userName.getUpassword().equals(password)){
            return userName;
        }

        return null;
    }

}
