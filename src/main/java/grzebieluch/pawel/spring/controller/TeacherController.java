package grzebieluch.pawel.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by RENT on 2017-06-14.
 */
public class TeacherController {
    @RestController
    @RequestMapping("/api/teachers")


        @Autowired
        private StudentService studentService;

        @RequestMapping(value = "/create", method = POST)
        public StudentDTO create(@RequestBody StudentDTO studentDTO) {
            return studentService.create(studentDTO);
        }

        @RequestMapping(value = "/all", method = GET)
        public List<StudentDTO> findAll() {
            return studentService.findAll();
        }
    }

