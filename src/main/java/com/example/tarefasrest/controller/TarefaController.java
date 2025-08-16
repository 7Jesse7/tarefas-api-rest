package com.example.tarefasrest.controller;

import com.example.tarefasrest.model.Tarefa;
import com.example.tarefasrest.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    // Criar uma tarefa
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // Consultar todas as tarefas
    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    // Consultar uma tarefa pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return tarefaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar uma tarefa
    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa novaTarefa) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefa.setNome(novaTarefa.getNome());
                    tarefa.setDataEntrega(novaTarefa.getDataEntrega());
                    tarefa.setResponsavel(novaTarefa.getResponsavel());
                    tarefaRepository.save(tarefa);
                    return ResponseEntity.ok(tarefa);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Remover uma tarefa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerTarefa(@PathVariable Long id) {
        var tarefaOptional = tarefaRepository.findById(id);

        if (tarefaOptional.isPresent()) {
            tarefaRepository.delete(tarefaOptional.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
