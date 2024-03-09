package com.tda.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tda.project.model.entity.InterfaceInfo;

/**
 * @author tdali
 * @description 针对表【post(帖子)】的数据库操作Service
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
