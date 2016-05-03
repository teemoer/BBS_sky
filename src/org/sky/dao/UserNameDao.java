package org.sky.dao;

import org.sky.entity.UserName;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public interface UserNameDao {
    public UserName findByName(String name);
}
