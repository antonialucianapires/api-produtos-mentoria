package com.alps.produtos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ProdutoResponseDTO {
    private String id;
    private String nome;
    private String descricao;
    
}
