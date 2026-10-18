package in.ragiyo.crudSpringBootDemo.service;

import in.ragiyo.crudSpringBootDemo.entity.Student;
import in.ragiyo.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        //business logic will be performed here
        System.out.println("inside student service createStudent");
        Student studentResponse = studentRepository.save(studentReq);
        System.out.println("exiting  student service createStudent");

        return studentResponse;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp= studentRepository.findById(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentList= studentRepository.findAll();
        return studentList;
    }

    public Student updateStudent(Long id,Student studentReq){
        Optional<Student> studentResp= studentRepository.findById(id);
        if(studentResp.isEmpty()){
            return null;
        }
        Student studentToSave=studentResp.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());

        return studentRepository.save(studentToSave);
    }

    public boolean deleteStudent(Long id){
        Optional<Student> studentResp= studentRepository.findById(id);
        if(studentResp.isEmpty()){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
