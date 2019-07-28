package com.nuiiqk.bridge;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nuiiqk.facade.IBaseService;

/**
 * 统一门面类
 * 
 * @author nuiiqk
 *
 */
@Component
public class FacadeHolder {

  private static final String VER = "1.0.0";

  /**
   * 日志操作
   */
  @Reference(version = VER)
  private IBaseService baseService;

  /*
   * 根据接口
   */
  public IBaseService getBaseService() {
    return baseService;
  }

  public void setBaseService(IBaseService baseService) {
    this.baseService = baseService;
  }


}
