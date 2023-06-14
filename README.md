# Formação Desenvolvedor Moderno
## Módulo: Programação Moderna
### Capítulo: Programação funcional, expressões lambda

# DESAFIO: Análise de vendas 2
### Desenvolvimento do projeto:

<p>Você deve ler um arquivo .csv contendo uma base de dados de registros
de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto ao lado (Atenção: não use tipos primitivos int e double
nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto).</p>

<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_2/blob/main/img/PROJETO-UML.png">

<p>Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo
(a ordem em que os vendedores são mostrados não importa).</p>

<p>Atenção: seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.</p>

<p>Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma
mensagem conforme exemplo.</p>

### DICAS:


<OL>
  <li>Para resolver este problema, você deve primeiro varrer toda a lista gerando os nomes únicos de cada
vendedor. Para fazer isso de forma eficiente, use a coleção Set ou Map, pois estas não admitem repetição.</li>
  <li>Uma vez que você tenha uma coleção com os nomes únicos de cada vendedor, use métodos Stream +
lambda para extrair o total vendido por cada um.</li>
</OL>

<p>Atenção: use métodos Stream + lambda para extrair os resultados a partir da lista original.</p>

<p>Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma
mensagem conforme exemplo.</p>

### Exemplo 1
<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_2/blob/main/img/EXEMPLO_1.png">

### Exemplo 2
<img src="https://github.com/vivianezzt/DesafioAnaliseDeVendas_2/blob/main/img/EXEMPLO_2.png">

### CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):
<ol>
  <li>Leitura correta do arquivo.</li>
  <li>Uso das coleções Set e/ou Map de forma coerente.</li>
  <li>Uso das funções Stream + lambda de maneira coerente.</li>
  <li>Tratamento de exceção correto.</li>
  <li>Resultados com valores corretos.</li>
</ol>  


<h3> CRÉDITOS &copy;</h3>
<h4> Este desafio foi proposto pelo Prof. <a href="https://www.instagram.com/devsuperior.ig/">Nélio Alves</a> no Módulo - Programação Moderna (JAVA)
</h4><a href="https://devsuperior.com.br/evento-sds">DEVSUPERIOR - Faça parte você támbem</a>
