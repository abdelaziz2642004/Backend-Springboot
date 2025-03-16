package org.example.authenticationappbackend.Repository;

import org.example.authenticationappbackend.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
