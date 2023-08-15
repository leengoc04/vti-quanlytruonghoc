package database;

import models.Department;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.DepartmentRepository;

import java.beans.BeanProperty;
@Configuration
public class Database {
    //Se duoc goi khi bat dau chay chuong trinh
    @Bean
    CommandLineRunner initDatabase(DepartmentRepository departmentRepo){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                System.out.println("database");
                Department department1 = new Department();
                department1.setId(1);
                department1.setName("IT");
                department1.setDesc("CNTT");

                Department department2 = new Department();
                department2.setId(2);
                department2.setName("MKT");
                department2.setDesc("Marketing");
                if (departmentRepo.findAll().size()==0){
                departmentRepo.save(department1); //Insert table department
                departmentRepo.save(department2);   //Insert table department
                }

            }
        };
    }
}
