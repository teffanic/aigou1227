package cn.teffanic.aigou.web.controller;

import cn.teffanic.aigou.domain.Employee;
import cn.teffanic.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController

public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("xxx".equals(employee.getUsername())&&"xxxooo".equals(employee.getPassword())){
            return AjaxResult.success(null);
        }else {
            return AjaxResult.fail();
        }
    }

    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult tttt(){
       return AjaxResult.success();
    }
}
