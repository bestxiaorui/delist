package com.company.project.system.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.commom.ServiceException;
import com.company.project.system.dao.DMemberMapper;
import com.company.project.system.entity.DMember;
import com.company.project.system.entity.vo.DMemberLikeVo;
import com.company.project.system.entity.vo.DMemberUpdateVo;
import com.company.project.system.entity.vo.DMemberVo;
import com.company.project.system.service.IDMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
@Service
public class DMemberServiceImpl extends ServiceImpl<DMemberMapper, DMember> implements IDMemberService {


    @Autowired
    DMemberMapper dMemberMapper;


    @Override
    public List<DMemberVo> getMemberList() {
        List<DMemberVo> dMembers = dMemberMapper.getMemberList(Wrappers.query());

        if(dMembers==null||dMembers.isEmpty()) {
            throw new ServiceException("数据查询失败");
        }
        return dMembers;
    }

    @Override
    public List<DMemberVo> getMemberListLike(DMemberLikeVo memberLikeVo) {
        List<DMemberVo> memberList = dMemberMapper.getMemberList(
                Wrappers.query()
                        .eq("mt.name", memberLikeVo.getMemberType())
                        .like("m.organization", memberLikeVo.getOrganization())
        );
        if(memberList==null||memberList.isEmpty()){
            throw new ServiceException("查询失败");
        }
        return memberList;
    }

    @Override
    public DMemberVo getMemberVoById(String id) {
        DMemberVo memberVo = dMemberMapper.getMemberVoById(id);
        if(memberVo==null) {
            throw new ServiceException("查询失败");
        }
        return memberVo;
    }

    @Override
    public int updateEmailById(DMemberUpdateVo memberUpdateVo) {
        int i = dMemberMapper.updateEmailById(memberUpdateVo);
        if(i==0){
            throw new ServiceException("更新失败");
        }
        return i;
    }
}
