package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPacientes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPacientes dados) {
        System.out.println(dados);
    }
}
