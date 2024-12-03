package br.com.fiap.pontoappapi.students;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentsRepository studentsRepository;

    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public List<Student> listAll() {
        return studentsRepository.findAll();
    }

}
