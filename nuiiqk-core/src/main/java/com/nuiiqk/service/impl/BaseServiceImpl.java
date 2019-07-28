package com.nuiiqk.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.nuiiqk.facade.IBaseService;

/**
 * .接口实现
 * @Service注解为Dubbo提供的com.alibaba.dubbo.config.annotation.Service，
 * 而非Spring的那个。其中interfaceClass是指要发布服务的接口。
 * 将HelloService接口的实现暴露到Zookeeper中了
 * @author nuiiqk
 *
 */
@Service(version = "1.0.0", timeout = 90000, retries = 0)
@Component
public class BaseServiceImpl implements IBaseService {

  @Override
  public String test() {
    return "你找到我了";
  }
}
