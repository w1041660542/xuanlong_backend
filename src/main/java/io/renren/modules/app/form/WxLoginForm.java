/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.app.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "登录表单")
public class WxLoginForm {
    @ApiModelProperty(value = "登录临时id")
    @NotBlank(message="登录临时id不能为空")
    private String code;

    @ApiModelProperty(value = "昵称")
    @NotBlank(message="昵称不能为空")
    private String nickname;

    @ApiModelProperty(value = "头像")
    @NotBlank(message="头像不能为空")
    private String photo;

}
