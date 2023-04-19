package com.chuanqihou.stu.domain;
import java.util.Objects;

/**
 * 用户实体类
 */
public class User {

  private Long id;
  private String uname;
  private String sex;
  private String tel;
  private String profession;
  private Float sal;
  private String address;


  public User(String uname, String sex, String tel, String profession, Float sal, String address) {
    this.uname = uname;
    this.sex = sex;
    this.tel = tel;
    this.profession = profession;
    this.sal = sal;
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User users = (User) o;
    return Objects.equals(id, users.id) && Objects.equals(uname, users.uname) && Objects.equals(sex, users.sex) && Objects.equals(tel, users.tel) && Objects.equals(profession, users.profession) && Objects.equals(sal, users.sal) && Objects.equals(address, users.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uname, sex, tel, profession, sal, address);
  }

  @Override
  public String toString() {
    return "Users{" +
            "id=" + id +
            ", uname='" + uname + '\'' +
            ", sex='" + sex + '\'' +
            ", tel='" + tel + '\'' +
            ", profession='" + profession + '\'' +
            ", sal=" + sal +
            ", address='" + address + '\'' +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public Float getSal() {
    return sal;
  }

  public void setSal(Float sal) {
    this.sal = sal;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User() {
  }

  public User(Long id, String uname, String sex, String tel, String profession, Float sal, String address) {
    this.id = id;
    this.uname = uname;
    this.sex = sex;
    this.tel = tel;
    this.profession = profession;
    this.sal = sal;
    this.address = address;
  }
}
