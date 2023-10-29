package com.helloworld.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.helloworld.demo.entity.Demo;
import com.helloworld.demo.model.DemoForm;
import com.helloworld.demo.service.DemoService;

/**
 * Helloコントローラー
 * 画面の制御のみを専念すべきクラスです。
 * ビジネスロジックはサービスクラスに委譲します。
 */
@Controller
public class HelloController {

  @Autowired
  private DemoService demoService;

  @GetMapping(value = "/hello")
  public String get(DemoForm form, Model model) throws Exception {

    System.out.println("debug");

    Demo demo = demoService.get(1);

    model.addAttribute("message", demo.getMsg());

    return "hello";
  }

  @PostMapping(value = "/hello")
  public String post(DemoForm form, Model model) throws Exception {

    demoService.update(form);

    model.addAttribute("message", form.getMessage());

    return "hello";
  }

}
