package com.shubh.data_analysis.Userfiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shubh.data_analysis.Datahubfiles.Datahub;
import com.shubh.data_analysis.Datahubfiles.Datahub_repo;

@Configuration
@ComponentScan(basePackages = { "com.example.spring_vscode.Userfiles" })
public class User_service {
    @Autowired
  private User_crudrepo repo;
    @Autowired
  // private Datahub_repo datarepo;

  public User save(User user) {
    return repo.save(user);
  }
    
  
  //searching user
  public List<User> findAll() {
    return repo.findAll();
  }

  public User findById(int id) {
    return repo.findById(id).orElse(null);
  }



  //deleting
  public void deleteById(int id) {
    repo.deleteById(id);
  }
  
  public void deleteall() {
    repo.deleteAll();
  }

  //retrieve datahub
  public List<Datahub> retrievealldatahubs(int id) {
    User user = repo.findById(id).orElse(null);
    return user.getDatahub();
  }

  // public List<Datahub> retrievespecific(int id, int p_id) {
  //    User user = repo.findById(id).orElse(null);
  //    List<Datahub> temp = user.getDatahub();
  //    List<Datahub> matchingDatahubs = new ArrayList<>();
  //   return temp.stream().filter(it -> it.getP_id() == p_id).toList();
  //   // for (Datahub it : temp) {
  //   //   if (it.getP_id() == p_id) {
  //   //     matchingDatahubs.add(it);
  //   //   }
  //   // }
  //   // return matchingDatahubs;
  // }

 
  





  

}
