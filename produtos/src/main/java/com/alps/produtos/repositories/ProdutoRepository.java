package com.alps.produtos.repositories;

import com.alps.produtos.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
    
}
