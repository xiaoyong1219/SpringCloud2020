package com.xiaoyong.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 订单实体类
 *
 * @author dongxiaoyong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 支付流水号
     */
    private String serial;
}
