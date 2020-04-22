package com.company.project.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
public class DMember implements Serializable {


    private String id;

    private String code;

    private String organization;

    private String eMail;

    private String creditCode;

    private String openingBank;

    private String bankAccount;

    private String dDeptId;

    private String dMemberTypeId;


}
