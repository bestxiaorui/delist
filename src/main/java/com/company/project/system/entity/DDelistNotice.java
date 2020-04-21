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
public class DDelistNotice implements Serializable {


    private Integer id;

    private String type;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime publicTime;

    private Integer dDeptId;

    private Integer upTimes;

    private String title;

    private String status;


}
