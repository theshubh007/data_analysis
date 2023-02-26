package com.shubh.data_analysis.Datahubfiles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shubh.data_analysis.Userfiles.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Datahub {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   int Datahub_id;

  @Column(name = "P_id")
   int P_id;

  @ManyToOne(fetch = FetchType.LAZY)
   @JsonIgnore
   private User user;
  


  public Datahub() {
  }

  public Datahub(int datahub_id, int p_id, User user) {
    Datahub_id = datahub_id;
    P_id = p_id;
    this.user = user;
  }

  public int getDatahub_id() {
    return Datahub_id;
  }

  public void setDatahub_id(int datahub_id) {
    Datahub_id = datahub_id;
  }

  public int getP_id() {
    return P_id;
  }

  public void setP_id(int p_id) {
    P_id = p_id;
  }

 
 
  
}
