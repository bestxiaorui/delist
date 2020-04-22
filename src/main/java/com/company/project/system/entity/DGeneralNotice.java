package com.company.project.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author B组
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DGeneralNotice implements Serializable {


    private String id;

    private String title;

    @TableField("ABSTRACT")
    private String abstractA;

    private String imgUrl;

    private Integer status;

    private String source;

    private Integer lookTimes;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createUserId;

    private String updateUserId;


}
