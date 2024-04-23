package com.aluno.dadosAlunos.controller;

import com.aluno.dadosAlunos.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    @SuppressWarnings("rawtypes")
    @PostMapping("/add")
    public ResponseEntity addAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {
        return ResponseEntity.ok(alunos);
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping("/{id}")
    public ResponseEntity deleteAluno(@PathVariable int id) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId() == id) {
                alunos.remove(i);
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @SuppressWarnings("rawtypes")
    @PutMapping("/{id}")
    public ResponseEntity updateAluno(@PathVariable int id, @RequestBody Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId() == id) {
                alunos.set(i, alunoAtualizado);
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

}
