package repositories;

import models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends
        JpaRepository <Department,Integer> {
//Cung cấp các phương thức để làm việc với table
//    Insert
//  Update
//    Delete
//    FindAll
//
}