public class Fornecedor {
    private String endereco;
    private String nome;
    private String email;
    private String telefone;
    private String relacaoItem;

public Fornecedor(
    String endereco,
    String nome,
    String email,
    String telefone,
    String relacaoItem
){
this.endereco = endereco;
this.nome = nome;
this.email = email;
this.telefone = telefone;
this.relacaoItem = relacaoItem;

}
public String getendereco(){
    return endereco;
}
public String getnome(){
    return nome;
}
public String getemail(){
    return email;
}
public String gettelefone(){
    return telefone;
}
public String getrelacaoItem(){
    return relacaoItem;
}

public void setendereco(
    String endereco
){
    this.endereco = endereco;
}
public void setnome(
    String nome
){
    this.nome = nome;
}
public void setemail(
    String email
){
    this.email = email;
}
public void settelefone(
    String telefone
){
    this.telefone = telefone;
}
public void setrelacaItem(
    String relacaoItem
){
    this.relacaoItem = relacaoItem;
}

}
