package br.com.etechoracio.viagem.controller;

import br.com.etechoracio.viagem.entity.Viagem;
import br.com.etechoracio.viagem.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagens")
public class viagemController {

    @Autowired
    private ViagemRepository repository;

    @GetMapping
    public List<Viagem> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long Id)
    {
        Optional<Viagem> existe = repository.findById(Id);
        if(existe.isPresent()) {
            return ResponseEntity.ok(existe);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> inserir(@RequestBody Viagem body) {
        Viagem Inserido = repository.save(body);
        return ResponseEntity.ok(Inserido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@RequestBody Viagem obj,@PathVariable Long id) {
        Optional<Viagem> existe = repository.findById(id);
        if(existe.isPresent())
        {
            repository.save(obj);
            return ResponseEntity.ok(existe);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        Optional<Viagem> existe = repository.findById(id);
        if(existe.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
