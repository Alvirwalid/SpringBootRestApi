package com.soft.RestApi.rest;

import com.soft.RestApi.entity.Student;
import com.soft.RestApi.exception.StudentErrorResponse;
import com.soft.RestApi.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api" )
public class StudentRestController {

    List<Student>studentList;
    @PostConstruct
    public  void loadDataInit(){


        studentList=new ArrayList<>();
//        List< Data>datalist=new ArrayList<Data>();
//        List<Data> dataList = new ArrayList<>();
//        dataList.add(new Data(12,"Alvi","alvi@gmail.com"));
//        dataList.add(new Data(13,"Topu","topu@gmail.com"));
//        dataList.add(new Data(14,"Dipu","dipu@gmail.com"));
        studentList.add(new Student("true"," to my json"));
        studentList.add(new Student("false"," my json"));
        studentList.add(new Student("hjjksaaue","welcoon"));


    }


@GetMapping(value = "/students")
    public List<Student>getStudents(){

        return  studentList;
    }
@GetMapping(value = "/students/{studentid}")
    public  Student getStudent(@PathVariable int studentid){

        if(studentid>=studentList.size() || (studentid<0)){
            throw  new StudentNotFoundException("student id not found - "+studentid);
        }



    return studentList.get(studentid);

    }


}
