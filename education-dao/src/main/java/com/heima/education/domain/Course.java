package com.heima.education.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 课程表
 */
public class Course implements Serializable {

    private Integer id;//主键id
    private String name;//课程名称
    private String type;//课程类型
    private String classify;//课程分类
    private String classifyName;
    private String subClassify;//课程二级分类
    private String subClassifName;
    private String direction;//课程方向
    private String username;//归属人
    private Integer level;//课程级别：1-初级，2-中级，3-高级
    private Integer free;//是否免费：0-否，1-是
    private BigDecimal price;//课程价格
    private String time;//时长
    private Integer onsale;//未上架（0）、上架（1）
    private String picture;//
    private String brief;//课程描述
    private Integer recommend;//未推荐（0）、推荐（1）
    private Integer weight;//权重
    private Integer studyCount;//学习人数
    private Date createTime;//
    private String createUser;//
    private Date updateTime;//
    private String updateUser;//
    private Integer del;//

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getSubClassify() {
        return subClassify;
    }

    public void setSubClassify(String subClassify) {
        this.subClassify = subClassify;
    }

    public String getSubClassifName() {
        return subClassifName;
    }

    public void setSubClassifName(String subClassifName) {
        this.subClassifName = subClassifName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOnsale() {
        return onsale;
    }

    public void setOnsale(Integer onsale) {
        this.onsale = onsale;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStudyCount() {
        return studyCount;
    }

    public void setStudyCount(Integer studyCount) {
        this.studyCount = studyCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", classify='" + classify + '\'' +
                ", classifyName='" + classifyName + '\'' +
                ", subClassify='" + subClassify + '\'' +
                ", subClassifName='" + subClassifName + '\'' +
                ", direction='" + direction + '\'' +
                ", username='" + username + '\'' +
                ", level=" + level +
                ", free=" + free +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", onsale=" + onsale +
                ", picture='" + picture + '\'' +
                ", brief='" + brief + '\'' +
                ", recommend=" + recommend +
                ", weight=" + weight +
                ", studyCount=" + studyCount +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", del=" + del +
                '}';
    }
}
