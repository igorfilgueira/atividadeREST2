package com.ecommerce.igorfilgueira.controller;

import com.ecommerce.igorfilgueira.model.PessoaModel;
import com.ecommerce.igorfilgueira.service.PessoaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaServiceImpl pessoaService;

    public PessoaController(PessoaServiceImpl pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity<List<PessoaModel>> listarTodasAsPessoas() {
        List<PessoaModel> response = pessoaService.listarTodasAsPessoas();

        return response == null ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaModel> retornarPessoaPeloId(@PathVariable Long id) {
        PessoaModel response = pessoaService.retornarPessoaPeloId(id);

        return response == null? ResponseEntity.notFound().build() : ResponseEntity.ok(response);
    }

    @PostMapping("/save")
    public ResponseEntity<PessoaModel> inserirPessoa(@RequestBody PessoaModel pessoaModel) {

        PessoaModel response =  pessoaService.inserirPessoa(pessoaModel);
        return response == null? ResponseEntity.badRequest().build(): ResponseEntity.ok(response) ;
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaModel> atualizarPessoaPeloId(@PathVariable Long id, @RequestBody PessoaModel pessoaModel) {
        PessoaModel response =  pessoaService.atualizarPessoaPeloId(id , pessoaModel);
        return response == null? ResponseEntity.badRequest().build(): ResponseEntity.ok(response) ;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteById(@RequestParam(value = "id", required = false) Long id) {

        boolean success = pessoaService.deletarPessoaPeloId(id);

        return success? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();

    }
}