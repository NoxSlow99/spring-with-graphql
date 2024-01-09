package com.graphql.persistence;

import com.graphql.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDAO extends CrudRepository<Student, Long> {
}
