package com.company.project.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.system.entity.DMember;
import com.company.project.system.entity.vo.DMemberLikeVo;
import com.company.project.system.entity.vo.DMemberUpdateVo;
import com.company.project.system.entity.vo.DMemberVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
public interface IDMemberService extends IService<DMember> {

    /** 获得会员列表
     * @return 会员List
     */
    List<DMemberVo> getMemberList();


    /**
     * 根据会员类型和模糊名称查询
     * @return 会员List
     * @param memberLikeVo 会员Vo对象，只有会员类型和模糊名两个字段
     */
    List<DMemberVo> getMemberListLike(DMemberLikeVo memberLikeVo);

    /** 通过id查询会员信息。
     * @param id 会员ID
     * @return 会员对象
     */
    DMemberVo getMemberVoById(String id);

    /** 通过id修改会员邮箱
     * @param memberUpdateVo 会员V对象，只有id,和邮箱两个字段
     * @return 返回影响条数
     */
    int updateEmailById(DMemberUpdateVo memberUpdateVo);
}
