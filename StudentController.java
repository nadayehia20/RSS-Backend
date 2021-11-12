package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path="{ID}")
    public  void deleteStudent(@PathVariable("ID") Long ID){

        studentService.deleteStudent(ID);
    }

    @PutMapping(path="{ID}")
    public void updateStudent(
        @PathVariable("ID") Long ID,
         @RequestParam(required = false) String source,
         @RequestParam(required = false) String title,
         @RequestParam(required = false) String description,
         @RequestParam(required = false) String fullLink,
         @RequestParam(required = false) String creator,
         @RequestParam(required = false) String date,
         @RequestParam(required = false) Integer timeToRead,
         @RequestParam(required = false) String image
         
         ){
        studentService.updateStudent(ID,source,title,description,fullLink,creator,date,timeToRead,image);
    }
}
