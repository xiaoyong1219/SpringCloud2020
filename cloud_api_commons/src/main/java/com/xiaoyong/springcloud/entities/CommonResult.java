package com.xiaoyong.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 公共返回实体
 *
 * @author dongxiaoyong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 结果码
     */
    private Integer code;
    /**
     * 结果提示
     */
    private String message;
    /**
     * 响应数据集
     */
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
