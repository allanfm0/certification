package br.com.allanfelipe.certification.modules.students.UseCases;

import org.springframework.stereotype.Service;

import br.com.allanfelipe.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("allanfelipedk@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
