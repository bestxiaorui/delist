package com.conpany.project;

import com.company.project.system.dao.*;
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

    @Test
    public void test1(){
//        System.out.println(dMemberMapper.selectById(1));
////        System.out.println(dMemberTypeMapper.selectById(1));
////        System.out.println(userMapper.selectById(1));
        log.info("testInfo");
        log.error("testError");
        log.debug("testDebug");
    }
}
