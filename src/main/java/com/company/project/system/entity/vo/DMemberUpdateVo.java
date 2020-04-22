package com.company.project.system.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DMemberUpdateVo {

    @NotBlank(message = "id不能为空")
    private String id;

    @Email(message = "邮箱格式错误")
    private String eMail;
}
