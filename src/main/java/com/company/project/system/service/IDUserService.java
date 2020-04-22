package com.company.project.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.system.entity.DUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
public interface IDUserService extends IService<DUser> {
    /**
     * 得到用户列表
     * @return  返回用户集合
     */
    List<DUser> getUserList();

    /**
     * 插入一个用户
     * @param user user数据
     * @return 返回影响数据
     */
    int insertUser(DUser user);

    /**
     * 更新用户数据
     * @param user uesr数据
     * @return 返回影响数据
     */
    int updateUser(DUser user);
}
