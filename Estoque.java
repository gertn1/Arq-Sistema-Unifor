public class Estoque{

private String nome;
private String tipo;
private String cor;
private String caracteristica;
private double valorCusto;
private double percentualLucro;
private int quantidadeEstoque;

public Estoque(
String nome,
String tipo,
String cor,
String caracteristica,
double valorCusto,
double percentualLucro,
int quantidadeEstoque
){
this.nome = nome;
this.tipo = tipo;
this.cor = cor;
this.caracteristica = caracteristica;
this.valorCusto = valorCusto;
this.percentualLucro = percentualLucro;
this.quantidadeEstoque = quantidadeEstoque;
}

public String getnome(){
    return nome;
}
public String gettipo(){
    return tipo;
}
public String getcor(){
    return cor;
}
public String getcaracteristica(){
    return caracteristica;
}
public double getvalorcusto(){
    return valorCusto;
}
public double getpercentualLucro(){
    return percentualLucro;
}

public int getquantidadeEstoque(){
return quantidadeEstoque;
}

public void setnome(
    String nome
){
    this.nome = nome;
}
public void settipo(
    String tipo
){
    this.tipo = tipo;
}
public void setcor(
    String cor
){
    this.cor = cor;
}
public void setcaracteristica(
    String caracteristica
){
    this.caracteristica = caracteristica;
}
public void setvalorcusto(
    double valorCusto
){
    this.valorCusto = valorCusto;
}
public void setpercentualLucro(
    double percentualLucro
){
    this.percentualLucro = percentualLucro;
}

public void setquantidadeEstoque(
    int quantidadeEstoque
){
    this.quantidadeEstoque = quantidadeEstoque;
}


}