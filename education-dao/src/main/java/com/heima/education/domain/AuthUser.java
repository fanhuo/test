package com.heima.education.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表
 */
public class AuthUser implements Serializable {

    private Integer id;//主键id
    private String realname;//登录用户名
    private String username;//真实姓名
    private String password;//密码
    private Integer gender;//性别
    private String header;//头像
    private String mobile;//手机号码
    private Integer status;//状态：待审核（0），有效（1），无效（3）
    private Date birthday;//生日
    private String education;//学历：大专、本科、硕士、博士、博士后
    private String collegeCode;//大学编码
    private String collegeName;//大学名称
    private String certNo;//资格证书编号
    private String title;//头衔
    private String sign;//签名
    private String openId;//微信公众号openid
    private String wechatId;//微信号
    private String qq;//qq号
    private Date loginTime;//最后一次登录时间
    private String ip;//最后一次登录IP
    private String province;//所在省份
    private String city;//所在城市
    private String district;//所在地区
    private Integer weight;//权重
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(String collegeCode) {
        this.collegeCode = collegeCode;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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
        return "AuthUser{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", header='" + header + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", birthday=" + birthday +
                ", education='" + education + '\'' +
                ", collegeCode='" + collegeCode + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", certNo='" + certNo + '\'' +
                ", title='" + title + '\'' +
                ", sign='" + sign + '\'' +
                ", openId='" + openId + '\'' +
                ", wechatId='" + wechatId + '\'' +
                ", qq='" + qq + '\'' +
                ", loginTime=" + loginTime +
                ", ip='" + ip + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", weight=" + weight +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", del=" + del +
                '}';
    }
}
