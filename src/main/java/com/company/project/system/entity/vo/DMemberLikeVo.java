package com.company.project.system.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DMemberLikeVo {

    @NotBlank(message = "类型不能为空")
    private String memberType;

    @NotBlank(message = "查询不能为空")
    private String organization;
}
