package org.sky.controller.zy;

import org.sky.entity.Plate;
import org.sky.entity.Result;
import org.sky.service.LoadByPlateAll;
import org.sky.service.imp.LoadByPlateAllImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/4/30 0030.
 */
@Controller
@RequestMapping("/zy")
public class LoadZyController {
    @Resource
    private LoadByPlateAllImp loadByPlateAll;


    @RequestMapping("/bk.do")
    @ResponseBody
    public Result LoadByBkAll(){
        Result result =loadByPlateAll.loadBk();
        return result;
    }

}
