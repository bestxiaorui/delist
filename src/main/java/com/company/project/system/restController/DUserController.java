package com.company.project.system.restController;


import com.company.project.commom.ServiceException;
import com.company.project.system.entity.DUser;
import com.company.project.system.service.IDUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author B组 xiaorui
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/user")
public class DUserController {

    @Autowired
    IDUserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<DUser> getList(){
        List<DUser> userList = userService.getUserList();
        if (userList == null||userList.isEmpty()) {
            throw new ServiceException("数据查询失败");
        }
        return userList;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DUser getUserById(@PathVariable("id")String id) {
        DUser user = userService.getById(id);
        if(user==null){
            throw new ServiceException("数据查询失败");
        }

        return user;
    }

    @PostMapping("/insert")
    @ResponseBody
    public int insertUser(@RequestBody @Valid DUser user){
        int result = userService.insertUser(user);
        if(result==0){
            throw new ServiceException("插入失败");
        }
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateUser(@RequestBody @Valid DUser user){
        int result = userService.updateUser(user);
        if(result==0){
            throw new ServiceException("更新失败");
        }
        return result;
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean deleteUser(@RequestBody String id){
        boolean result = userService.removeById(id);
        if(!result){
            throw new ServiceException("删除失败");
        }
        return true;
    }


}
