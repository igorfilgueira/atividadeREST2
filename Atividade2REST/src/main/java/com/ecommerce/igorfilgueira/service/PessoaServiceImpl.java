package com.ecommerce.igorfilgueira.service;

import com.ecommerce.igorfilgueira.handler.exceptions.RecursoNaoEncontradoException;
import com.ecommerce.igorfilgueira.model.PessoaModel;
import com.ecommerce.igorfilgueira.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService{
    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<PessoaModel> listarTodasAsPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public PessoaModel retornarPessoaPeloId(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Pessoa não encontrada com id " + id));
    }

    @Override
    public PessoaModel inserirPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }

    @Override
    public PessoaModel atualizarPessoaPeloId(Long id, PessoaModel pessoaModel) {
        PessoaModel pessoaModelAtualizada = pessoaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("ID não encontrado " + id));

        if (pessoaModel.getNome() != null) {
            pessoaModelAtualizada.setNome(pessoaModel.getNome());
        }
        if (pessoaModel.getCpf() != null) {
            pessoaModelAtualizada.setCpf(pessoaModel.getCpf());
        }
        if (pessoaModel.getRg() != null) {
            pessoaModelAtualizada.setRg(pessoaModel.getRg());
        }
        if (pessoaModel.getDataDeNascimento() != null) {
            pessoaModelAtualizada.setDataDeNascimento(pessoaModel.getDataDeNascimento());
        }
        if (pessoaModel.getEstadoCivil() != null) {
            pessoaModelAtualizada.setEstadoCivil(pessoaModel.getEstadoCivil());
        }
        if (pessoaModel.getTelefone() != null) {
            pessoaModelAtualizada.setTelefone(pessoaModel.getTelefone());
        }
        if (pessoaModel.getEmail() != null) {
            pessoaModelAtualizada.setEmail(pessoaModel.getEmail());
        }

        return pessoaRepository.save(pessoaModelAtualizada);
    }

    @Override
    public boolean deletarPessoaPeloId(Long id) {
        PessoaModel pessoaModel = pessoaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("ID não encontrado " + id));

        pessoaRepository.delete(pessoaModel);
        return true;
    }


}