package com.helloworld.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * DemoテーブルのEntityクラス
 */
@Getter
@Setter
@Entity
@Table(name = "demo")
public class Demo {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "msg")
    private String msg;

    public Demo() {
    }

    public Demo(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}

