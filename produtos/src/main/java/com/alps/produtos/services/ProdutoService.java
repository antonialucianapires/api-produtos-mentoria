package com.alps.produtos.services;

import com.alps.produtos.dto.request.ProdutoRequestDTO;
import com.alps.produtos.dto.response.ProdutoResponseDTO;

public interface ProdutoService {
    ProdutoResponseDTO criar(ProdutoRequestDTO produtoRequestDTO);
}
