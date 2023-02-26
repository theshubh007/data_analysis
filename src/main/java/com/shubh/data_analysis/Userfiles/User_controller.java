package com.shubh.data_analysis.Userfiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubh.data_analysis.Cutom_Exception_management.Usernotfound;
import com.shubh.data_analysis.Datahubfiles.Datahub;

@RestController
public class User_controller {

   @Autowired
   private User_service service;


    @GetMapping("/users")
  public List<User> retrievealluser() {
    return service.findAll();
    
  }

  @GetMapping("/users/{id}")
  public User retrieveuser(@PathVariable int id) {
    User user = service.findById(id);
    if(user==null)throw new Usernotfound("id-"+id);
    return user;
  }

  @GetMapping("/deleteuser/{id}")
  public void deleteuser(@PathVariable int id) {
    service.deleteById(id);
  }

  @GetMapping("/user/{id}/datahub")
  public List<Datahub> retrievealldatahubs(@PathVariable int id) {
    return service.retrievealldatahubs(id);
  }

  // @GetMapping("/user/{id}/{pid}")
  // public List<Datahub> retrievealldatahubs(@PathVariable int id,@PathVariable int pid) {
  //   return service.retrievespecific(id, pid);
  // }




  // @GetMapping("user/{u_id}/{p_id}")
  // public List<Datahub> retrievespecificdatahubs(@PathVariable int u_id, @PathVariable int p_id) {
  //   // return service.retrievespecificdatahubs(u_id, p_id);
  //   return service.matchtest(u_id, p_id);
  // }


  // //post practice
  @PostMapping("/saveuser")
  ResponseEntity<User> saveuser(@RequestBody User user) {
    User saveduser = service.save(user);
    // User saveduser1 = userservice.save(user);
    //return response status
    return ResponseEntity.status(HttpStatus.CREATED).body(saveduser);
  }
  

}
