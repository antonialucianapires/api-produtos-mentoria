package com.alps.produtos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class RespostaGenericaDTO {
    private String mensagem;
    private Object dado;
}
