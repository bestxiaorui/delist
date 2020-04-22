package com.company.project.system.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.company.project.system.entity.DMember;
import com.company.project.system.entity.vo.DMemberUpdateVo;
import com.company.project.system.entity.vo.DMemberVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
@Repository
public interface DMemberMapper extends BaseMapper<DMember> {


    /**
     * 获得会员列表
     *
     * @return 会员List
     */
    List<DMemberVo> getMemberList(@Param(Constants.WRAPPER) Wrapper wrapper);


    /**
     * 通过ID查询会员
     *
     * @param id 会员ID
     * @return 会员对象
     */
    DMemberVo getMemberVoById(String id);

    /**
     * 通过id修改会员邮箱
     *
     * @param memberUpdateVo 会员V对象，只有id,和邮箱两个字段
     * @return 返回影响条数
     */
    int updateEmailById(DMemberUpdateVo memberUpdateVo);
}
