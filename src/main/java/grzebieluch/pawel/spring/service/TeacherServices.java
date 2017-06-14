package grzebieluch.pawel.spring.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by RENT on 2017-06-14.
 */
@Service
public interface TeacherServices {
        List<StudentDTO> findAll();
        StudentDTO findOne(String uuid);
        StudentDTO create(StudentDTO studentDTO);
    }
