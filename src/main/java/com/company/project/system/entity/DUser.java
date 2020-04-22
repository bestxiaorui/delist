package com.company.project.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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
public class DUser implements Serializable {

    private String id;
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "密码不能为空")
    private String password;
    @Email(message = "邮箱格式不对")
    private String eMail;


}
