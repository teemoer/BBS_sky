package org.sky.controller.login;

import org.sky.entity.Result;
import org.sky.entity.UserName;
import org.sky.service.UserNameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserNameService uns;

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    @ResponseBody
    public Result execute(@RequestParam String uname,@RequestParam String upassword , HttpSession httpSession){
        Result result = new Result();
        UserName userName= uns.checkLogin(uname,upassword);

        if (userName != null){
            result.setStatus(0);
            result.setMsg("登录成功");
            httpSession.setAttribute("userName", userName);
            return result;
        }
        result.setStatus(1);
        result.setMsg("用户名或密码错误");
        return result;
    }


    @RequestMapping(value = "/loadDate.do",method = RequestMethod.GET)
    @ResponseBody
    public Result ecute(HttpSession httpSession){
        Result result = new Result();
        UserName userName= (UserName) httpSession.getAttribute("userName");
        if (userName != null){
            result.setStatus(0);
            result.setMsg("验证通过成功获取用户数据");
            result.setData(userName);
            return result;
        }
        result.setStatus(1);
        result.setMsg("验证失败");
        return result;
    }

}
