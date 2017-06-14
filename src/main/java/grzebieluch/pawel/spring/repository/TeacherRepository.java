package grzebieluch.pawel.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RENT on 2017-06-14.
 */
public class TeacherRepository {
    @Repository
    public interface StudentRepository extends JpaRepository<Student, Long> {

        Student findOneByUuid(String uuid);
    }
}
