package com.ecommerce.igorfilgueira.service;


import com.ecommerce.igorfilgueira.model.PessoaModel;

import java.util.List;

public interface PessoaService {
    List<PessoaModel> listarTodasAsPessoas();

    PessoaModel retornarPessoaPeloId(Long id);

    PessoaModel inserirPessoa(PessoaModel pessoaModel);

    PessoaModel atualizarPessoaPeloId(Long id, PessoaModel pessoaModel);

    boolean deletarPessoaPeloId(Long id);
}