package org.example;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

    @Dado("^que criei o arquivo corretamente$")
    public void que_criei_o_arquivo_corretamente() throws Throwable {
    }

    @Quando("^Quando executá-lo$")
    public void quando_executá_lo() throws Throwable {
    }

    @Então("^Então a especificação deve finalizar com sucesso$")
    public void então_a_especificação_deve_finalizar_com_sucesso() throws Throwable {
    }
    private int contador = 0;
    @Dado("^que o valor do contador é (\\d+)$")
    public void que_o_valor_do_contador_é(int arg1) throws Throwable {
        contador = arg1;
    }


    @Quando("^eu incrementar em (\\d+)$")
    public void eu_incrementar_em(int arg1) throws Throwable {
        contador = contador+arg1;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void o_valor_do_contador_será(int arg1) throws Throwable {
        System.out.println(contador);
    }

}
