package com.company.project.system.restController;


import com.company.project.commom.ServiceException;
import com.company.project.system.entity.vo.DMemberUpdateVo;
import com.company.project.system.entity.vo.DMemberVo;
import com.company.project.system.service.IDMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/member")
public class DMemberController {


    @Autowired
    IDMemberService memberService;


    @GetMapping("list")
    @ResponseBody
    public List<DMemberVo> getList(){

        return memberService.getMemberList();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DMemberVo getMemberById(@PathVariable("id") String id){

        return memberService.getMemberVoById(id);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean deleteMemberById(@RequestBody String id){
        boolean result = memberService.removeById(id);
        if(!result){
            throw new ServiceException("删除失败");
        }
        return true;
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateEmail(@RequestBody @Valid DMemberUpdateVo memberUpdateVo) {

        return memberService.updateEmailById(memberUpdateVo);
    }
}
