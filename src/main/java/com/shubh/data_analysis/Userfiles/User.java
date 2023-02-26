package com.shubh.data_analysis.Userfiles;

import java.util.List;

import com.shubh.data_analysis.Datahubfiles.Datahub;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
  @jakarta.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
   
  @Column(name = "user_name")
  String name;

  @Column(name = "user_email")
  String email;



  @OneToMany(mappedBy = "user")
  private List<Datahub> datahub;
 
  public User() {
  
}
  public User(int id,String name, String email) {
    this.name = name;
    this.email = email;
    this.id = id;

  }
  
  public String getName() {
    return name;
  }

  
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
    public List<Datahub> getDatahub() {
    return datahub;
  }
  public void setDatahub(List<Datahub> datahub) {
    this.datahub = datahub;
  }
  
}
