package org.sky.service;

import org.sky.entity.Result;
import org.sky.entity.UserName;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public interface UserNameService {
    public UserName checkLogin(String name, String password);
}
