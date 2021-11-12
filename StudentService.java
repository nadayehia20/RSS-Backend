package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        //System.out.println(student);
        studentRepository.save(student);
    }

    public void deleteStudent(Long ID) {
        boolean exists=studentRepository.existsById(ID);
        if(! exists){
            throw new IllegalStateException("Student with id "+ ID +
                    "does not exist");
        }

        studentRepository.deleteById(ID);


    }

    @Transactional
    public void updateStudent(Long ID, String source, String title, String description, String fullLink, String creator,
    		String date, Integer timeToRead, String image) {
        Student student = studentRepository.findById(ID)
                .orElseThrow(() -> new IllegalStateException(
                        "STUDENT WITH ID " + ID + "DOES NOT EXIST"
                ));
        if(source != null && source.length()>0 &&
                !Objects.equals(student.getSource(),source))
        {
            student.setSource(source);
        }

        if(title != null && title.length()>0 &&
                !Objects.equals(student.getTitle(),title))
        {
            student.setTitle(title);
        }
        
        if(description != null && description.length()>0 &&
                !Objects.equals(student.getDescription(),description))
        {
            student.setDescription(description);
        }
        
        if(fullLink != null && fullLink.length()>0 &&
                !Objects.equals(student.getFullLink(),fullLink))
        {
            student.setFullLink(fullLink);
        }
        
        if(creator != null && creator.length()>0 &&
                !Objects.equals(student.getCreator(),creator))
        {
            student.setCreator(creator);
        }
        
        if(date != null && date.length()>0 &&
                !Objects.equals(student.getDate(),date))
        {
            student.setDate(date);
        }
        
        if(timeToRead != null && timeToRead>0 &&
                !Objects.equals(student.getTimeToRead(),timeToRead))
        {
            student.setTimeToRead(timeToRead);
        }
        
        if(image != null && image.length()>0 &&
                !Objects.equals(student.getImage(),image))
        {
            student.setImage(image);
        }

    }
}
