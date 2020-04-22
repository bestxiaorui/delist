package com.company.project.system.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DMemberVo {

    private String id;

    private String code;

    private String organization;

    private String eMail;

    private String creditCode;

    private String openingBank;

    private String bankAccount;

    private String deptName;

    private String memberType;
}
