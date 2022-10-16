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

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 支付表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "支付表单")
public class PayOrderForm {
    @ApiModelProperty(value = "订单id")
    @Min(1)
    private String orderId;



}
