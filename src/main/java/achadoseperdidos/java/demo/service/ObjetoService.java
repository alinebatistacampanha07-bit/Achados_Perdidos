package achadoseperdidos.java.demo.service;

import achadoseperdidos.model.ObjetoPerdido;
import achadoseperdidos.repository.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ObjetoService {

    @Autowired
    private ObjetoRepository objetoRepository;

    public ObjetoPerdido salvar(ObjetoPerdido objeto) {
        objeto.setStatus("Disponível");
        return objetoRepository.save(objeto);
    }

    public List<ObjetoPerdido> listarTodos() {
        return objetoRepository.findAll();
    }

    public ObjetoPerdido marcarComoDevolvido(Long id, String devolvidoPara) {
        ObjetoPerdido objeto = objetoRepository.findById(id).orElseThrow();
        objeto.setStatus("Devolvido");
        objeto.setDevolvidoPara(devolvidoPara);
        return objetoRepository.save(objeto);
    }

    public void deletar(Long id) {
        objetoRepository.deleteById(id);
    }
}

