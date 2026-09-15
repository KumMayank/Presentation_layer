package com.jsp.mvc_restfulProject.controllers;


import com.jsp.mvc_restfulProject.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


// controller -->

@RestController
public class EmployeeController {

//    @GetMapping(path="getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: asdfk2330301@^%&*";
//    }


    @GetMapping("/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId, "Mayank", "M@gmail.com", 27, LocalDate.of(2024, 1, 2), true);
    }

    @GetMapping("/employees")
    public String getAllEmployee(@RequestParam Integer age) {
        return "Hi age: " + age;

    }

}
