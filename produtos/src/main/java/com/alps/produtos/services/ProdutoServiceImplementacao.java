package com.alps.produtos.services;

import com.alps.produtos.dto.request.ProdutoRequestDTO;
import com.alps.produtos.dto.response.ProdutoResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImplementacao  implements ProdutoService{

    private final CriarProdutoService criarProdutoService;

    @Autowired
    public ProdutoServiceImplementacao(CriarProdutoService criarProdutoService) {
        this.criarProdutoService = criarProdutoService;
    }

    @Override
    public ProdutoResponseDTO criar(ProdutoRequestDTO produtoRequestDTO) {
        return criarProdutoService.criar(produtoRequestDTO);
    }
    
}
