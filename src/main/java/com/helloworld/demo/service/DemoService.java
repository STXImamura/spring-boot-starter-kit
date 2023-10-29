package com.helloworld.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.demo.entity.Demo;
import com.helloworld.demo.model.DemoForm;
import com.helloworld.demo.repository.DemoRepository;

/**
 * サービスクラス
 * ここではビジネスロジックを記述します。
 * DBの操作に関してはDaoクラスに委譲します。
 */
@Service
public class DemoService {

  @Autowired
  private DemoRepository demoDao;

  public Demo get(int id) throws Exception {
    return demoDao.get(id);
  }

  public void update(DemoForm form) throws Exception {
    Demo demo = new Demo(
      1,
      form.getMessage()
    );

    demoDao.update(demo);
  }

}
