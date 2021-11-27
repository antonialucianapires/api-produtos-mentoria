package com.alps.produtos.services;

import com.alps.produtos.domain.Produto;
import com.alps.produtos.dto.request.ProdutoRequestDTO;
import com.alps.produtos.dto.response.ProdutoResponseDTO;
import com.alps.produtos.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarProdutoServiceImplementacao implements CriarProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public CriarProdutoServiceImplementacao(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoResponseDTO criar(ProdutoRequestDTO produtoRequestDTO) {

        Produto novoProduto = Produto.builder()
                .nome(produtoRequestDTO.getNome())
                .descricao(produtoRequestDTO.getDescricao())
                .build();

        Produto produtoSalvo = produtoRepository.saveAndFlush(novoProduto);

        return ProdutoResponseDTO.builder()
                .id(produtoSalvo.getId())
                .nome(produtoSalvo.getNome())
                .descricao(produtoSalvo.getDescricao())
                .build();
    }

}
