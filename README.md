# Guia DSList 

Nesse guia do projeto DSLista, você conhecerá todo o projeto. Vamos nessa!

Para maiores informações, veja o projeto no LinkedIn: [Post](https://www.linkedin.com/feed/update/urn:li:ugcPost:7063526613203787776/).


## O que foi o projeto

Para iniciarmos o guia, é necessário entender o que foi o projeto e de onde ele surgiu.

Bom, esse projeto veio do Intensivão Java Spring, do canal [Devsuperior](https://www.youtube.com/@DevSuperior). Juntamente com o professor
[Nélio Alves](https://www.linkedin.com/in/nelio-alves) aprendemos desde a inicialização de um projeto Spring até sua implementação na nuvem, passando por todo o processo
de construção, desenvolvimento, testes, homologação e deploy.

## Descrição do projeto

O projeto DSList consiste em uma API REST, que tem como recurso jogos. Nela nós podemos:

 - Requisição GET para receber todos os jogos cadastrados;
 - Requisição GET para receber todas as listas(categorias) de jogos cadastrados;
 - Requisição GET para receber um jogo específico;
 - Requisição GET para receber uma lista específica;
 - Requisição GET para receber todos os jogos de uma determinada lista;
 - Requisição POST para mudar a ordem dos jogos nas listas - você pode colocar seus jogos favoritos no topo da lista!

## Tecnologias utilizadas

Esse projeto, como você já deve ter percebido, foi construído em Java Spring. Porém não foi só isso, então, fique agora com o detalhamento das tecnologias utlizadas:

 - Java Spring Web;
 - Spring Data JPA;
 - PostgreSQL Driver;
 - H2 Database;

Todas essas dependências foram utilizadas para que o projeto tivesse êxito em todas as suas fases!

## Fases do projeto

 - Teste

Nessa fase de testes - primeira fase do projeto, nós inicializamos o desenvolvimento. Foi nela em que nós criamos o funcionamento básico 
do projeto, implementamos o Padrão de Camadas, as classes Services, Controllers e Repositories. Utilizamos nela, o banco de dados H2, um banco em memória 
que facilita a vida nessa primeira parte do projeto.

 - Dev
 
Entramos agora na parte de Homologação Local. Fizemos, nela, todos os testes da aplicação, utilizando um banco de dados PostgreSQL.

- Prod

Por fim, esse perfil foi utilizado na parte de implementação do projeto na nuvem, utilizando os serviços do [Railway](https://railway.app/).

<sub>Eu já removi o projeto da plataforma, motivo - Plano grátis 😓</sub>


## Finalização

Esse simples guia é só uma descrição básica do projeto, que eu amei fazer por sinal. Se você tiver interesse em mais, veja meu post no Linkedin...
O link está lá em cima, mas para te ajudar, toma ele aí de novo: [Post](https://www.linkedin.com/feed/update/urn:li:ugcPost:7063526613203787776/).

