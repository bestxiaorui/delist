package com.company.project.system.entity;

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
public class DBanner implements Serializable {


    private Integer id;

    private String name;

    private String sort;

    private String imgUrl;

    private String linkUrl;

    private LocalDateTime stopTime;

    private String displayStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer createUserId;

    private Integer parentId;


}
