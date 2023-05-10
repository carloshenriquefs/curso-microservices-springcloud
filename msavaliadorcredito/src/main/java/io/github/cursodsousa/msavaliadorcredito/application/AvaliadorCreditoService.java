package io.github.cursodsousa.msavaliadorcredito.application;

import io.github.cursodsousa.msavaliadorcredito.domain.model.SituacaoCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    public SituacaoCliente obterSituacaoCliente(String cpf) {
        // obterDadosCliente - MSCLIENTES
        // obter cartoes do cliente - MsCartoes
        return new SituacaoCliente();
    }

}
