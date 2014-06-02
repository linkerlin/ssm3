package com.bolo.examples.base.entity;

import com.bolo.annotation.Words;

/**
 * 角色管理
 *
 * @author 菠萝大象
 */
public class Role {

    private Integer id; //主键
    @Words(filed = "角色名称")
    private String name; //角色名称
    private String sex; //性别
    private String edu; //学历

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }
}
