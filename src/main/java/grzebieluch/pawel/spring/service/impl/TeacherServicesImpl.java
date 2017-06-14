package grzebieluch.pawel.spring.service.impl;

import grzebieluch.pawel.spring.service.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by RENT on 2017-06-14.
 */
@Service
public class TeacherServicesImpl implements TeacherServices{



        @Autowired
        private StudentRepository studentRepository;

        @Autowired
        private StudentMapper studentMapper;

        @Override
        public List<StudentDTO> findAll() {
            return studentMapper.toStudentDTOList(studentRepository.findAll());
        }

        @Override
        public StudentDTO findOne(String uuid) {
            return studentMapper.toStudentDTO(studentRepository.findOneByUuid(uuid));
        }

        @Override
        public StudentDTO create(StudentDTO studentDTO) {

            Student newStudent = studentMapper.toStudent(studentDTO);
            newStudent.setUuid(UUID.randomUUID().toString());

            return studentMapper.toStudentDTO(studentRepository.save(newStudent));
        }
}
