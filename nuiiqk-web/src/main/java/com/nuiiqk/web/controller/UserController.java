package com.nuiiqk.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuiiqk.service.BaseService;


/**
 * 控制层
 * 
 * @author nuiiqk
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private BaseService baseService;

  @GetMapping(value = "/test")
  public String test() {
    String temp = baseService.getTest();
    return temp;
  }

}
