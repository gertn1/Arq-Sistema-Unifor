public class Principal{

public static void main(String[] args){
Estoque E1 = new Estoque("TV Samsung","LED", "preto" , "TV LED, 52', Econimia de energia ", 1000.00, 250.00,150); 
System.out.print("ALTERAR DADOS DO PRODUTO"+ "\n");
E1.setnome("TV LG");
E1.setcor("Branco");
E1.settipo("LED");
E1.setcaracteristica("tv led,52");
E1.setvalorcusto(233.65);
E1.setquantidadeEstoque(185);   
E1.setpercentualLucro(125.66);
System.out.println("ESTOQUE" + "\n" + "Nome do Produto.........: " + E1.getnome());
System.out.println("Carateristicas..........: " + E1.getcaracteristica());
System.out.println("Cor.....................: " + E1.getcor());
System.out.println("Quantidade..............: " + E1.getquantidadeEstoque());
System.out.println("Tipo....................: " + E1.gettipo());
System.out.println("Percentual de lucro.....: " + E1.getpercentualLucro()+"\n");


Produto  P1 = new Produto(25, "TV Samsung",1000.00,"TV do Brasil.com", "preto", "TV LED, 52', Econimia de energia ");
System.out.print("ALTERAR DADOS DOS"+ "\n");
P1.setnumProduto(356);
P1.setnomeProdutoe("TV PHILIPS");
P1.setpreco(999.99);
P1.setfornecedor("Ceará tv");
P1.setcor("Black piano");
P1.setcaractProduto("TV PHILIPS, 32',FULL HD " );

System.out.println("PRODUTO" + "\n" + "Numero do produto.......: " + P1.getnumProduto());
System.out.println("Nome do prduto..........: " + P1.getnomeProduto());
System.out.println("Cor do produto..........: " + P1.getcor());
System.out.println("Preço do produto........: " + P1.getpreco());
System.out.println("Caracteristicas do pro..: " + P1.getcaractProduto());
System.out.println("Fornecedor do pro.......: " + P1.getfornecedor()+"\n");

Fornecedor F1 = new Fornecedor("Rua do anjo, N° 22, Fortaleza ", "TV do brasil.com ", "tvbrasil.com", "5682222", "relacao");
System.out.print("ATUALIZAR CATÁLOGO DOS PRODUTOS"+ "\n");
F1.setendereco("Rua do expressionismo, N° 65, Jardins");
F1.setnome("TV CEARÁ");
F1.setemail("germanogmail.com");
F1.settelefone("9875463");
F1.setrelacaItem("TVs de todas as marcas");
System.out.println("FORNECEDOR" + "\n" + "Nome....................: " + F1.getnome());
System.out.println("Telefone................: " + F1.gettelefone());
System.out.println("Email...................: " + F1.getemail());
System.out.println("Endereço................: " + F1.getendereco());
System.out.println("Relação de itens........: " + F1.getrelacaoItem());

}

}