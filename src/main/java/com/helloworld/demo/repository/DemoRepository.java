package com.helloworld.demo.repository;

import org.springframework.stereotype.Repository;
import com.helloworld.demo.entity.Demo;

import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Daoクラス
 * DBの操作に特化したクラスです。
 */
@Repository
public class DemoRepository {

  @PersistenceContext
  private EntityManager entityManager;

  /**
   * DB取得処理
   * @param id
   * @return
   * @throws Exception
   */
  public Demo get(int id) throws Exception {
    return entityManager.find(Demo.class, id);

    // // 直接SQLを書く場合
    // Query query = entityManager.createNativeQuery(
    //   "select ID, MSG from DEMO where ID = :id",
    //   Demo.class
    // );
    // query.setParameter("id", id);
    // return (Demo)query.getSingleResult();
  }

  /**
   * DB更新処理
   * @param demo
   * @throws Exception
   */
  @Transactional
  public void update(Demo demo) throws Exception {
    // Demoを更新する
    entityManager.merge(demo);

    // 直接SQLを書く場合
    // Query query = entityManager.createNativeQuery(
    //   "update DEMO set MSG = :msg where ID = :id",
    //   Demo.class
    // );

    // query.setParameter("msg", demo.getMsg());
    // query.setParameter("id", demo.getId());
    // query.executeUpdate();
  }

}
