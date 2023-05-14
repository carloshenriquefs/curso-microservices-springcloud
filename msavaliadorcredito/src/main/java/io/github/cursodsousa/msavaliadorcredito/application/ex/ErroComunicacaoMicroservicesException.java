package io.github.cursodsousa.msavaliadorcredito.application.ex;

import lombok.Getter;

public class ErroComunicacaoMicroservicesException extends Exception {

    @Getter
    public Integer status;

    public ErroComunicacaoMicroservicesException(String msg, Integer status) {
        super(msg);
        this.status = status;
    }
}
