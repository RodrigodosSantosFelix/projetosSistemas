package com.servico.criarprodutos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(
        name = "CriarProdutos",
        serviceName = "CriarProdutosService")
public class CriarProduto {

    @WebMethod(operationName = "gerarProduto")
    public Produto gerrarProduto(@WebParam(name = "descricao") String descricao, @WebParam(name = "fabricante") String fabricante, @WebParam(name = "valor") double valor) 
    {
        Produto objtoProduto = new Produto(descricao,fabricante,valor);
        return objtoProduto;
    }
}
