package org.sky.service.imp;

import org.sky.dao.PlateDao;
import org.sky.entity.Plate;
import org.sky.entity.Result;
import org.sky.entity.bk;
import org.sky.service.LoadByPlateAll;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/30 0030.
 */
@Service
@Transactional
public class LoadByPlateAllImp implements LoadByPlateAll {
    @Resource
    private PlateDao pd;
    public Result loadUserBooks() {
        //加载板块分类信息
        Result result = new Result();
        List<Plate> list = pd.findByPlateALL();

        result.setData(list);
        result.setStatus(0);
        result.setMsg("加载板块分类信息成功");
        return result;
    }
    public Result loadBk() {
      //加载板块信息
        Result result = new Result();
        List<bk> list = pd.findByBkALL();
        List<Plate>list2 = pd.findByPlateALL();

        result.setData(list);
        result.setData2(list2);
        result.setStatus(0);
        result.setMsg("加载板块信息成功");
        return result;
    }
    public List<Plate> loadBkxx() {
        //加载板块分类信息
        List<Plate> list = pd.findByPlateALL();
        return list;
    }
}
