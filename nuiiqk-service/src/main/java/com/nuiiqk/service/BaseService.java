package com.nuiiqk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nuiiqk.bridge.FacadeHolder;


/**
 * 服务
 * 
 * @author nuiiq
 *
 */
@Component
public class BaseService {

  @Autowired
  private FacadeHolder facadeHolder;

  public String getTest() {
    return facadeHolder.getBaseService().test();
  }

}
