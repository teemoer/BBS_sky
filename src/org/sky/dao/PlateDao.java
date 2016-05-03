package org.sky.dao;

import org.sky.entity.Plate;
import org.sky.entity.bk;

import java.util.List;

/**
 * Created by Administrator on 2016/4/30 0030.
 */
public interface PlateDao {
    public List<bk> findByBkALL();
    public List<Plate> findByPlateALL();

}
