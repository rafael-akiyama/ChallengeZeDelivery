
## ***Cadastro de Clientes***
Projeto criado para automatizar o cadastro de cliente via plataforma web, que verifica se o cliente foi cadastrado com sucesso utilizando o e-mail para fazer o cadastro.
<p> <br />

### ***Fluxos Críticos***

Conforme solicitado, seguem os 3 fluxos que considero mais crítico, sem contar o exemplo dado.

***1. Pesquisa de Produtos***
É onde o cliente faz a primeira interação com a aplicação, é muito importante causar uma boa impressão e ser funcional, afinal tem que atrair a atenção do cliente.

***2. Cadastro do Cliente***
É um passo necessário para finalizar a compra e começar a atender o cliente, pois sem o cadastro o cliente não consegue efetuar a compra.

***3. Finalizar Pedido***
É quando atende as duas partes, pois confirma a venda, o que é bom para o site, e consegue atender o cliente, que no final sabe que vai receber os produtos.
<p> <br />


### ***Fluxo escolhido para automatizar***


#### ***Cadastro de cliente***

Automação para cadastro de usuário na plataforma web do Zé Delivery utilizando o e-mail para fazer o cadastro.
<p> <br />


### ***Utilizado***

 - Java
 - Eclipse
 - BDD
 - Cucumber
 - Selenium
 - JUnit
 - Page Objects
<p> <br />

### ***Pré Requisito para execução***

- Javas
- IDE
- Plugin Cucumber
<p> <br />

### ***Como executar o teste***

1. Clonar o repositório
2. Importar o projeto para a IDE
3. Instalar plugin Cucumber (Ex. no Eclipse > Help > Eclipse Marketplace > Find > Digitar Cucumber > Install)
4. Alterar encoding para UTF-8 (Ex. no Eclipse > Properties > Resource > Text file encoding > UTF-8)
5. Executar a classe Runner (DesafioZeDelivery > src/test/java > br.com.web.runners > Runner.java)
<p> <br />
 
 ### ***Pontos a serem considerados***
Foi feito buscas dos elementos utilizando id, name e xpath, para ficar claro que eu consigo sair do outro lado, sei que a melhor forma é por id ou name.

### ***Melhorias para fazer no site***
1. Quando cadastramos um novo usuário, é exigido que a senha tenha pelo menos 1 caracter sendo número, porém não aceita a senha somente com números e isso não está explícito.
2. A validação de campo único está sendo feito pelo e-mail, na minha opnião poderia ser utilizado o CPF, pois não tem motivos para o mesmo CPF ter mais de um cadastro.
3. Quando abri um novo ticket de suporte, através do link Me ajuda, Zé, no formulário, os campos que estão como obrigatórios para fazer o preenchimento, estão em inglês e poderiam estar em português, como todo o site.
 
