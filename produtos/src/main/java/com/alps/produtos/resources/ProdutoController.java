package com.alps.produtos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alps.produtos.dto.request.ProdutoRequestDTO;
import com.alps.produtos.dto.response.ProdutoResponseDTO;
import com.alps.produtos.dto.response.RespostaGenericaDTO;
import com.alps.produtos.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController (ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<RespostaGenericaDTO> criarProduto(@RequestBody ProdutoRequestDTO produtoDTO) {

        ProdutoResponseDTO produtoResponseDTO = produtoService.criar(produtoDTO);

        RespostaGenericaDTO resposta = RespostaGenericaDTO.builder()
        .mensagem("Produto criado com sucesso!")
        .dado(produtoResponseDTO)
        .build();

        return new ResponseEntity<>(resposta, HttpStatus.CREATED);
    }
    
    
}
