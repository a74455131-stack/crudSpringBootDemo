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
        studentReq.setDeleted(false);
        Student studentResponse = studentRepository.save(studentReq);
        return studentResponse;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp= studentRepository.findByidAndDeletedFalse(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }
// select * from student where id=1 and deleted=false;
    //findByidAndDeletedisFalse
    public List<Student> getAllStudent(){
        List<Student> studentList= studentRepository.findByDeletedFalse();
        return studentList;
    }

    public Student updateStudent(Long id,Student studentReq){
        Optional<Student> studentResp= studentRepository.findByidAndDeletedFalse(id);
        if(studentResp.isEmpty()){
            return null;
        }
        Student studentToSave=studentResp.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setRoll_no(studentReq.getRoll_no());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setDeleted(false);
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

    public boolean deleteStudentSoftly(Long id){
        Optional<Student> studentResp= studentRepository.findByidAndDeletedFalse(id);
        if(studentResp.isEmpty()){
            return false;
        }
        Student studentToSoftDelete=studentResp.get();
        studentToSoftDelete.setDeleted(true);
        studentRepository.save(studentToSoftDelete);
        return true;
    }
}
