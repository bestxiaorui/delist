package com.company.project.system.dao;

import com.company.project.system.entity.DUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
@Repository
public interface DUserMapper extends BaseMapper<DUser> {
    /**
     * 检查用户是否存在
     * @param name 用户名
     * @return 1 存在 0 不存在
     */
    int checkExist(String name);
}
