public class Produto {
    private int numProduto;
    private String nomeProduto;
    private double preco;
    private String fornecedor;
    private String cor;
    private String caractProduto;

public Produto(
    int numProduto,
    String nomeProduto,
    double preco,
    String fornecedor,
    String cor,
    String caractProduto){

    this.numProduto = numProduto;
    this.nomeProduto = nomeProduto;
    this.preco = preco;
    this.fornecedor = fornecedor;
    this.cor = cor;
    this.caractProduto = caractProduto;

}
public int getnumProduto(){
    return numProduto;
}
public String getnomeProduto(){
    return nomeProduto;
}
public double getpreco(){
    return preco;
}
public String getfornecedor(){
    return fornecedor;
}
public String getcor(){
    return cor;
}
public String getcaractProduto(){
    return caractProduto;
}


public void setnumProduto(
    int numProduto
){
    this.numProduto = numProduto;
}
public void setnomeProdutoe(
    String nomeProduto
){
    this.nomeProduto = nomeProduto;
}
public void setpreco(
    double preco
){
    this.preco = preco;
}
public void setfornecedor(
    String fornecedor
){
    this.fornecedor = fornecedor;
}
public void setcor(
    String cor
){
    this.cor = cor;
}
public void setcaractProduto(
    String caractProduto
){
    this.caractProduto = caractProduto;
}


}


    