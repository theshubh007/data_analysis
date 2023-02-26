package com.shubh.data_analysis.Userfiles;

import java.util.List;

import org.aspectj.apache.bcel.util.ClassLoaderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shubh.data_analysis.Datahubfiles.Datahub;


public interface User_crudrepo extends JpaRepository<User, Integer> {

}
