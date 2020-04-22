package com.conpany.project;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.project.system.dao.*;
import com.company.project.system.entity.DUser;
import com.company.project.system.entity.vo.DMemberLikeVo;
import com.company.project.system.entity.vo.DMemberVo;
import com.company.project.system.service.IDMemberService;
import com.company.project.system.service.IDUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class test extends Tester{

    @Autowired
    DBannerMapper banner;
    @Autowired
    DDelistNoticeMapper dDelistNotice;
    @Autowired
    DDeptMapper dDeptMapper;
    @Autowired
    DGeneralNoticeMapper dGeneralNoticeMapper;
    @Autowired
    DMemberMapper dMemberMapper;
    @Autowired
    IDMemberService idMemberService;
    @Autowired
    DMemberTypeMapper dMemberTypeMapper;
    @Autowired
    DUserMapper userMapper;
    @Autowired
    IDUserService userService;

    @Autowired
    IDUserService service;

    @Test
    public void test1(){
        System.out.println(dMemberMapper.selectById("aweaw"));
////        System.out.println(dMemberTypeMapper.selectById(1));
////        System.out.println(userMapper.selectById(1));
        log.info("testInfo");
        log.error("testError");
        log.debug("testDebug");
    }
    @Test

    public void test2(){
        DUser user = new DUser().setId("1").setName("JACK").setPassword("JACK").setEMail("12456789@qq.com");
//        System.out.println(user);
//        boolean insert = userService.removeById(user.getId());
//        System.out.println(insert);
        System.out.println(userMapper.selectById("1"));
    }

    @Test
    public void test3(){
        DMemberVo memberList = dMemberMapper.getMemberVoById("13");
        log.info("{}",memberList);
//        memberList.forEach(e->{log.info("list:{}",e);});
//        dMemberMapper.updateEmailById(new DMemberUpdateVo().setId("2").setEMail("qq.com"));
    }

    @Test
    public void test4(){
        QueryWrapper<DMemberVo> dMemberQueryWrapper = new QueryWrapper<>();
//        dMemberQueryWrapper.eq("id","1");
        dMemberQueryWrapper.like("organization","阿");
        System.out.println(dMemberMapper.getMemberList(dMemberQueryWrapper));
    }

    @Test
    public void test5(){
        DMemberLikeVo dMemberLikeVo = new DMemberLikeVo().setMemberType("综合类会员").setOrganization("阿");
        System.out.println(idMemberService.getMemberListLike(dMemberLikeVo));
    }
}
