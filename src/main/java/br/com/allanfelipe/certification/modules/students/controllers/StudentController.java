package br.com.allanfelipe.certification.modules.students.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.allanfelipe.certification.modules.students.UseCases.VerifyIfHasCertificationUseCase;
import br.com.allanfelipe.certification.modules.students.dto.VerifyHasCertificationDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")

public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyIfHasCertificationDTO) {

        var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
        if (result) {
            return "Usuario ja fez a prova";
        }

        return "Usuario pode fazer a prova!";
    }

}
