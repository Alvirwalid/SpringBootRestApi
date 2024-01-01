package com.soft.RestApi.rest;

import com.soft.RestApi.entity.Student;
import com.soft.RestApi.entity.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api" )
public class StudentRestController {


@GetMapping(value = "/students")
    public List<Student>getStudents(){

    List< Data>datalist=new ArrayList<Data>();
    List<Data> dataList = new ArrayList<>();
    dataList.add(new Data(12,"Alvi","alvi@gmail.com"));
    dataList.add(new Data(13,"Topu","topu@gmail.com"));
    dataList.add(new Data(14,"Dipu","dipu@gmail.com"));

        List<Student>studentList=new ArrayList<Student>();

        studentList.add(new Student("true","welcome to my json",dataList));


        return  studentList;
    }




}
