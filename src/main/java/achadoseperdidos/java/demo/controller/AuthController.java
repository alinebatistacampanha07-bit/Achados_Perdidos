package achadoseperdidos.java.demo.controller;

import achadoseperdidos.model.Usuario;
import achadoseperdidos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Cadastro de usuário
    @PostMapping("/register")
    public Usuario registrar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Login simples (sem JWT, apenas validação básica)
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
        if (usuario.isPresent() && usuario.get().getSenha().equals(senha)) {
            return "Login realizado com sucesso!";
        }
        return "Credenciais inválidas!";
    }
}
