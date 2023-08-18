# :construction: README customizado em construção ! :construction:
<!-- # `Projeto Final - Agrix - Fase A`

Boas-vindas ao repositório do projeto `Projeto Final - Agrix - Fase A`

Para realizar o projeto, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**,
nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu projeto a partir
desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes
do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu projeto, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo
sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79)
e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que
precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Maria e João são pessoas empreendedoras que estão muito preocupadas com os impactos ambientais e
sociais dos nossos processos agrícolas. Por isso, decidiram criar a AgroTech, uma empresa
especializada em tecnologias para melhorar a eficiência no cultivo de plantações. Isso visa reduzir
o desperdício de recursos em geral e de alimentos em específico, fazendo um uso mais responsável da
terra disponível para plantio.

O primeiro produto dessa empresa será o Agrix, um sistema que permitirá a gestão e o monitoramento
das fazendas participantes. Esse produto será desenvolvido em fases.

Neste projeto você deverá desenvolver uma aplicação Spring Boot com algumas funcionalidades
iniciais, e que servirá de base para as próximas fases.

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste projeto, verificamos se você é capaz de:

- Aplicar o conhecimento do ecossistema Spring para criar rotas da API.
- Aplicar a injeção de dependência para conectar as camadas de controle, serviço e persistência.
- Utilizar o Spring Data JPA para implementar entidades e repositórios para a persistência em banco
  de dados.
- Implementar gerenciamento de erros no Spring Web.
- Criar o Dockerfile para configurar a aplicação para execução no Docker.

</details>

<details>
<summary><strong>🗓 Data de Entrega</strong></summary>

- Este projeto é individual
- Serão `3` dias de projeto
- Data de entrega para avaliação regular do projeto: `18/08/2023 14:00`

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

- `mvn install -DskipTests`

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu projeto:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-projeto`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do projeto os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do projeto:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo
      _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o projeto. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_
  do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no
  botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull
  Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira
  que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante
visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde -
      no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na
      primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste projeto o `Checkstyle`. Assim o código
estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção!
Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do
repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no
seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção
do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES
DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:

```bash
mvn test
```

Para executar apenas uma classe de testes:

```bash
mvn test -Dtest="TestClassName"
```

</details>

## Especificações do projeto

<details>
<summary> ⚠️ Informações sobre como implementar os requisitos</summary><br>

Os testes deste projeto são, de maneira geral, testes de integração. Cada teste fará diversas chamadas à sua API e validará a resposta e o comportamento da aplicação, mas sem restringir implementações específicas de classes e métodos.

Por isso, neste projeto você terá maior liberdade para estruturar e implementar sua aplicação da forma que escolher, desde que atenda aos requisitos pedidos e algumas especificações que serão explicadas aqui.

Uma das restrições é que o projeto deve ser implementado utilizando o ecossistema Spring (Spring Boot, Spring Web, Spring Data, etc). Você pode utilizar outras bibliotecas e ferramentas se desejar, mas garanta que elas são compatíveis com o Spring e com os testes do projeto.
</details>

<details>
<summary>🗄️ Descrição do banco de dados</summary><br>

Sua aplicação deverá ser implementada considerando o seguinte modelo de tabelas:

![Modelo de tabelas](images/agrix-tabelas-fase-a.png)

Nesse modelos, temos as seguintes tabelas:
- `farm`: representa uma fazenda
- `crop`: representa uma plantação, e está em relacionamento `n:1` ("muitos para um") com a tabela `farm`
- `fertilizer`: representa um fertilizante, e está em um relacionamento `n:n` ("muitos para muitos") com a tabela `crop`. Esse relacionamento é realizado através da tabela `crop_fertilizer`.

Alguns elementos importantes a considerar sobre a implementação da camada de persistência e do banco de dados:
- Apesar do nome das tabelas e colunas (com seus tipos) não precisarem ser exatamente esses, os testes do projeto chamarão sua API usando requisições e esperam respostas baseados nesse modelo.
- Os testes do projeto não esperam um banco de dados específico. No entanto, sugerimos que você utilize o MySQL como banco de dados.
- Os testes do projeto utilizam um banco "mockado" em memória do tipo H2. Isso não deve afetar sua implementação, mas tome cuidado ao utilizar funcionalidades muito específicas de um determinado tipo de banco de dados e que não sejam compatíveis com os testes.
</details>

<details>
<summary>🏛️ Arquitetuda da aplicação</summary><br>

Como dito, neste projeto você terá maior liberdade para escolher como vai estruturar e implementar sua aplicação. Algumas dicas e recomendações:

- O projeto não possui uma estrutura pré-definida de pacotes (com algumas exceções). Ainda assim, recomendamos que você cuide para ter uma boa organização e divisão de pacotes. Na dúvida, se inspire no que você viu no conteúdo ou nos projetos anteriores.
- Da mesma maneira, não há exigência de uma arquitetura específica de camadas. No entanto, uma boa arquitetura pode ajudar a garantir não só uma maior qualidade de código, como também facilitar para você realizar manutenção e aprimoramentos posteriormente.
- Sugerimos que você considere utilizar os padrões e boas práticas que tem visto no conteúdo, aulas e projetos. Mas sinta-se à vontade também para estudar e pensar em como pode melhorar e expandir a forma com que estrutura seu código.

Por fim, a mensagem que deixamos é: aproveite a oportunidade para desenvolver mais sua capacidade de estruturar e construir uma aplicação!

</details>

## Requisitos

### 1. Crie uma API para controle de fazendas com a rota POST /farms

<details>
  <summary>Crie sua aplicação com uma API para gerenciamento de fazendas que inclua a rota POST</summary><br />

Neste requisito, você deverá criar a base para gerenciamento de fazendas da sua API, utilizando
Spring, Spring Boot, Spring Web e Spring Data. Lembre-se que, para isso, você deve criar e configurar sua aplicação apropriadamente, incluindo as dependências e quaisquer classes/camadas que julgar necessárias.

Neste requisito, além de criar a base da sua aplicação, você deverá criar também a primeira rota:

- `/farms` (`POST`)
    - deve receber via corpo do POST os dados de uma fazenda (veja abaixo para os
      dados de requisição e resposta)
    - deve salvar uma nova fazenda a partir dos dados recebidos
    - em caso de sucesso, deve:
        - retornar o status HTTP 201 (CREATED)
        - retornar os dados da fazenda criada. O `id` da fazenda deve estar incluso na resposta.

<details>
  <summary>🔍 Formato/exemplo de requisição e resposta</summary><br />

Exemplo de requisição:
```json
{
  "name": "Fazendinha",
  "size": 5
}
```

Exemplo de resposta:

```json
{
  "id": 1,
  "name": "Fazendinha",
  "size": 5
}
```
</details>

</details>


### 2. Crie a rota GET /farms

<details>
  <summary>Crie a rota GET /farms da sua API, para retornar todas as fazendas cadastradas </summary><br />

Neste requisito, você deverá criar a rota:

- `/farms` (`GET`)
    - deve retornar uma lista de todas as fazendas. O `id` da fazenda deve estar
      incluso na resposta.

<details>
  <summary>🔍 Formato/exemplo de resposta</summary><br />

Exemplo de resposta:

```json
[
  {
    "id": 1,
    "name": "Fazendinha",
    "size": 5.0
  },
  {
    "id": 2,
    "name": "Fazenda do Júlio",
    "size": 2.5
  }
]
```

</details>

</details>

### 3. Crie a rota GET /farms/{id}

<details>
  <summary>Crie a rota GET /farms da sua API, para retornar as informações de uma fazenda</summary><br />

Neste requisito, você deverá criar a rota:

- `/farms/{id}` (`GET`):
    - deve receber um `id` pelo caminho da rota e retornar a fazenda com esse `id`. O `id` da
      fazenda deve estar incluso na resposta.
    - caso não exista uma fazenda com esse `id`, a rota retornar o status HTTP 404 com a
      mensagem `Fazenda não encontrada!` no corpo da resposta. Você pode definir a estrutura da
      resposta como preferir, desde que contenha a mensagem.
        - Dica: pense desde já em como você vai fazer o gerenciamento de erros, pois isso afetará o
          restante da aplicação.

<details>
  <summary>🔍 Formato/exemplo de resposta</summary><br />

Exemplo de resposta para a rota `/farms/3` (supondo que exista uma fazenda com `id = 3`):

```json
{
  "id": 3,
  "name": "My Cabbages!",
  "size": 3.49
}
```

</details>

</details>

### 4. Crie a rota POST /farms/{farmId}/crops

<details>
  <summary>Continue a implementação da sua aplicação, agora criando a rota POST /farms/{farmId}/crops para criação de plantações</summary><br />

Neste requisito, você deverá criar a rota criação de plantações. Lembre-se que as plantações estão em um relacionamento `n:1` com as fazendas, então considere isso na hora de implementar sua solução deste e dos próximos requisitos.

A rota a ser criada é:
- `/farms/{farmId}/crops` (`POST`)
    - deve receber o `id` da fazenda pelo caminho da rota (representado aqui por `farmId` apenas para diferenciar da plantação)
    - deve receber via corpo do POST os dados da plantação (veja abaixo para os dados de requisição
      e resposta)
    - deve salvar a nova plantação a partir dos dados recebidos, associada à fazenda com o ID
      recebido
    - em caso de sucesso, deve:
        - retornar o status HTTP 201 (CREATED)
        - retornar os dados da plantação criada. A resposta deve incluir o `id` da plantação e
          o `id` da fazenda, mas não deve incluir os dados da fazenda.
    - caso não exista uma fazenda com o `id` passado, a rota deve retornar o status HTTP 404 com a
      mensagem `Fazenda não encontrada!` no corpo da resposta.
    - 
<details>
  <summary>🔍 Formato/exemplo de requisição e resposta</summary><br />

Exemplo de requisição na rota `/farms/1/crops` (supondo que exista uma fazenda com `id = 1`):

```json
{
  "name": "Couve-flor",
  "plantedArea": 5.43
}
```

Exemplo de resposta:

```json
{
  "id": 1,
  "name": "Couve-flor",
  "plantedArea": 5.43,
  "farmId": 1
}
```

Note que o `id` da resposta se refere à plantação, e que o da fazenda está em `farmId`.

</details>

</details>

### 5. Crie a rota GET /farms/{farmId}/crops

<details>
  <summary>Crie a rota GET /farms/{farmId}/crops para listar as plantações de uma fazenda</summary><br />

Neste requisito, você deverá criar a rota para listar as plantações de uma fazenda. A rota a ser criada é:
- `/farms/{farmId}/crops` (`GET`):
    - deve receber o `id` de uma fazenda pelo caminho
    - deve retornar uma lista com todas as plantações associadas à fazenda
    - caso não exista uma fazenda com esse `id`, a rota retornar o status HTTP 404 com a
      mensagem `Fazenda não encontrada!` no corpo da resposta.

<details>
  <summary>🔍 Formato/exemplo de resposta</summary><br />

Exemplo de resposta para a rota `/farms/1/crops` (supondo que exista uma fazenda com `id = 1`):

```json
[
  {
    "id": 1,
    "name": "Couve-flor",
    "plantedArea": 5.43,
    "farmId": 1
  },
  {
    "id": 2,
    "name": "Alface",
    "plantedArea": 21.3,
    "farmId": 1
  }
]
```

</details>

</details>

### 6. Crie a rota GET /crops

<details>
  <summary>Crie a rota GET /crops para listar todas as plantações cadastradas</summary><br />

A rota a ser criada é:
- `/crops` (`GET`)
    - deve retornar uma lista de todas as plantações cadastradas. A resposta deve incluir o `id` de
      cada plantação e o `id` da fazenda associada, mas não deve incluir os dados da fazenda.

<details>
  <summary>🔍 Formato/exemplo de resposta</summary><br />

```json
[
  {
    "id": 1,
    "name": "Couve-flor",
    "plantedArea": 5.43,
    "farmId": 1
  },
  {
    "id": 2,
    "name": "Alface",
    "plantedArea": 21.3,
    "farmId": 1
  },
  {
    "id": 3,
    "name": "Tomate",
    "plantedArea": 1.9,
    "farmId": 2
  }
]
```

</details>

</details>

### 7. Crie a rota GET /crops/{id}

<details>
  <summary>Crie a rota GET /crops/{id} para retornar as informações de uma fazenda</summary><br />

A rota a ser criada é:
- `/crops/{id}` (`GET`):
    - deve receber o `id` de uma plantação pelo caminho da rota
    - caso exista a plantação com o `id` recebido, deve retornar os dados da plantação. A resposta
      deve incluir o `id` de cada plantação e o `id` da fazenda associada, mas não deve incluir os
      dados da fazenda.
    - caso não exista uma plantação com o `id` passado, a rota deve retornar o status HTTP 404 com a
      mensagem `Plantação não encontrada!` no corpo da resposta.

<details>
  <summary>🔍 Formato/exemplo de resposta</summary><br />

Exemplo de resposta para a rota `/crops/3` (supondo que exista uma plantação com `id = 3`:

```json
{
  "id": 3,
  "name": "Tomate",
  "plantedArea": 1.9,
  "farmId": 2
}
```

</details>

</details>

### 8. Crie um Dockerfile para sua aplicação

<details>
  <summary>Crie um Dockerfile multi-estágio configurando a imagem Docker da sua aplicação</summary><br />

Finalmente, você deve construir um `Dockerfile` para rodar a sua aplicação no Docker.

Seu `Dockerfile`:

- Deve ser multi-estágio
- O primeiro estágio deve se chamar `build-image` e deve ser utilizado para a construção do pacote da sua aplicação, contendo:
    - Um diretório de trabalho (workdir) chamado `/to-build-app`
    - A cópia dos arquivos necessários
    - A instalação das dependências utilizando Maven
        - Aqui, se quiser você pode utilizar o goal `dependency:go-offline` do Maven, que vai baixar todas as dependências e pode ajudar o Docker a criar um cache que agilize o processo de re-criação da imagem.
    - A construção do pacote JAR utilizando Maven com o goal `package`
- O segundo estágio deve ser utilizado para a construção da imagem final, contendo:
    - Um diretório de trabalho (workdir) chamado `/app`
    - A cópia dos arquivos necessários a partir da imagem do primeiro estágio
    - A exposição da porta `8080`
    - Um ponto de entrada (entrypoint) executando o pacote da aplicação

Notas:
1. Você pode usar as imagens de base que preferir para cada estágio. Uma possibilidade é utilizar a `maven:3-openjdk-17` para o estágio de construção, pois já traz o Maven instalado. Já para o estágio final você pode usar uma imagem de tamanho reduzido, como a `eclipse-temurin:17-jre-alpine`, por exemplo.
2. Apesar de o Maven já instalar as dependências na construção do pacote, como mencionado é útil termos uma execução da instalação separada da construção no primeiro estágio, para termos os benefícios de cache do Docker e reduzir o tempo de reconstrução.
3. Quando for testar sua imagem, lembre-se que a exposição da porta no Dockerfile não faz o mapeamento automaticamente (diferente do `docker-compose`). Nesse caso, é necessário passar o mapeamento por parâmetro para o docker na hora da execução da imagem.

</details>

---

<details>
<summary><strong>🗣 Nos dê feedbacks sobre o projeto!</strong></summary>

Ao finalizar e submeter o projeto, não se esqueça de avaliar sua experiência preenchendo o
formulário.
**Leva menos de 3 minutos!**

[Formulário de avaliação do projeto](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH26-JAVA&template=betrybe/java-0x-projeto-final-agrix-fase-a)

</details>

<details>
<summary><strong>🗂 Compartilhe seu portfólio!</strong></summary>

Você sabia que o LinkedIn é a principal rede social profissional e compartilhar o seu aprendizado lá
é muito importante para quem deseja construir uma carreira de sucesso? Compartilhe esse projeto no
seu LinkedIn, marque o perfil da Trybe (@trybe) e mostre para a sua rede toda a sua evolução.

</details>

---
-->
