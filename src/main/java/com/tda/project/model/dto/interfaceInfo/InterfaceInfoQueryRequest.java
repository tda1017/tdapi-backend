package com.tda.project.model.dto.interfaceInfo;

import com.tda.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author tda
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 主键
     * 用户可能根据id查询
     */
    private Long id;

    /**
     * 名称
     * 用户可能根据名称查询
     */
    private String name;

    /**
     * 描述
     * 用户可能根据描述查询
     */
    private String description;

    /**
     * 接口地址
     * 用户可能根据地址查询
     */
    private String url;
//下面的都有可能
    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;
}