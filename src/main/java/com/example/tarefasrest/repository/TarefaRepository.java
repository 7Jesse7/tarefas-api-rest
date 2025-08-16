package com.example.tarefasrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tarefasrest.model.Tarefa;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

