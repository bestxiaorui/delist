package com.company.project.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.commom.ServiceException;
import com.company.project.commom.UUIDUtils;
import com.company.project.system.dao.DUserMapper;
import com.company.project.system.entity.DUser;
import com.company.project.system.service.IDUserService;
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
public class DUserServiceImpl extends ServiceImpl<DUserMapper, DUser> implements IDUserService {

    @Autowired
    DUserMapper userMapper;

    @Override
    public List<DUser> getUserList() {
        return userMapper.selectList(null);
    }

    @Override
    public int insertUser(DUser user) {
        String name = user.getName();
        int i = userMapper.checkExist(name);
        if(i!=0){
            throw new ServiceException("用户已存在");
        }
        user.setId(UUIDUtils.getUUID());
        return userMapper.insert(user);

    }

    @Override
    public int updateUser(DUser user) {
        int i = userMapper.checkExist(user.getName());
        if(i==0){
            throw new ServiceException("用户不存在");
        }
        return userMapper.updateById(user);
    }


}
