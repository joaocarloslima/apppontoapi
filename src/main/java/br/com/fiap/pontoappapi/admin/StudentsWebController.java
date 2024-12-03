package br.com.fiap.pontoappapi.admin;

import br.com.fiap.pontoappapi.students.Student;
import br.com.fiap.pontoappapi.students.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/students")
public class StudentsWebController {

    private final StudentService studentService;

    public StudentsWebController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String students(Model model) {
        model.addAttribute("students", studentService.listAll() );
        return "students";
    }

    @GetMapping("new")
    public String newStudent(Student student) {
        return "form";
    }

}
