package com.conpany.project;

import com.company.project.system.dao.*;
import com.company.project.system.entity.DUser;
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
        boolean insert = userService.removeById(user.getId());
//        System.out.println(insert);
        System.out.println(userMapper.selectById("1"));
    }
}
