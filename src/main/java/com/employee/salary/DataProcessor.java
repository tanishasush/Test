package com.employee.salary;

import org.springframework.batch.item.ItemProcessor;

import com.employee.salary.bean.User;



public class DataProcessor implements ItemProcessor<User, User> {

 @Override
 public User process(User user) throws Exception {
  return user;
 }

} 