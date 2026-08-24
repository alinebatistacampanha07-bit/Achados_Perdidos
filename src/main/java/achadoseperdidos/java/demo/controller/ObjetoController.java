package achadoseperdidos.java.demo.controller;

import achadoseperdidos.model.ObjetoPerdido;
import achadoseperdidos.service.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/objetos")
public class ObjetoController {

    @Autowired
    private ObjetoService objetoService;

    @PostMapping
    public ObjetoPerdido cadastrar(@RequestBody ObjetoPerdido objeto) {
        return objetoService.salvar(objeto);
    }

    @GetMapping
    public List<ObjetoPerdido> listar() {
        return objetoService.listarTodos();
    }

    @PutMapping("/{id}/devolver")
    public ObjetoPerdido devolver(@PathVariable Long id, @RequestParam String devolvidoPara) {
        return objetoService.marcarComoDevolvido(id, devolvidoPara);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        objetoService.deletar(id);
    }
}

