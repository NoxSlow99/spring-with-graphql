package com.graphql.persistence;

import com.graphql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseDAO extends CrudRepository<Course, Long> {
}
