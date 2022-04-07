# Java Explorer

**Projeto criado para reproduzir e consultar caracteristicas da linguagem java.**
<h4 align="left"> 
	🚧  Java Explorer 🚀 Em andamento... 🚧
</h4>


##Pré-requisitos

- Instalar o `Java JDK ` - [link](https://www.oracle.com/java/technologies/downloads/).

- Configurar `variável de ambiente JAVA_HOME` - [link](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26).


```bash
# Via prompt de comando(cmd) como administrador:
```
    > setx -m JAVA_HOME "C:\Program Files\Java\jdk-11.0.14"

    
`Definir o caminho para executar via prompt de comando.`</br>
    `- Selecione a variável Path e clique no botão Editar…`</br>
    `- Clique Novo`</br>
    `- Insira: %JAVA_HOME%\bin`  </br>



## Para Usar

```bash
# Via prompt de comando(cmd):

#Validar versão do Java
> Java -version

#Validar se Java_Home foi criado
> echo %Java_Home%

#Validar se Java_Home\bin foi incluido no Path
> echo %Path%

#Compilar o arquivo java, gerando um arquivo .class
> javac main.java

#Executar o arquivo .class
> java main

#Compilar arquivo dentro de um pacote
> C:\Users\Franca\Documents\Develop\Git\Java_Explorer\src\main\java\escopo>javac -d . myMain.java

#Executar o arquivo dentro de um pacote .class
> java escopo.myMain

#Executar o arquivo e informar um argumento
> java escopo.myMain Helio

#Executar o arquivo e informar o classpath (-cp)
> C:\Users\Franca\Documents\Develop\Git\Java_Explorer\src\main\java>java  -classpath escopo escopo.myMain A

#Executar o arquivo e informar variavél do sistema com -DNOME = Valor
> java -DJAVAA=teste escopo.myMain Helio

#Compilar tudo dentro de um pacote 
> C:\Users\Franca\Documents\Develop\Git\Java_Explorer\src\main\java\escopo>javac pacote/*.java


```

## Lembrete
`- byte, short, int long | char | float, double | boolean | String` </br>
`- Tipos primitivos inteiros: byte, short, char, int, long, boolean`</br>
`- Tipos primitivos com ponto flutuante: float, double` </br>
`- Variável de atributo possuem valor padrão, como 0 para numericos, null para objetos, falso para boleano`</br>
`- Variável de instacia, membro e objeto é o atributo da classe`</br>
`- Variável global ou da classe é uma variável static`</br>
`- Variável local está limitada a construtores, metodos ou qualquer bloco lógico.`</br>
`- Um atributo(variável de instancia ou objeto), e uma variável local podem ter o mesmo nome, por padrão usamos this.atributo para identificar o atributo`</br>
`- O Garbage Collector só apagada memória objetos sem referências, o momento que isso ocorre é desconhecido`

```bash
double d = 1d;
long l = 1l;
float f = 1f;

#nome da variável não pode começar com numéro, nem usar palavras reservadas com true, false, main, return, e para caracteres especial só permite $ e _.
#Por boa pratica a variável inicia com letra minúscula 
#O nome da variável é case sensitive, logo nome, é diferente de NOME.


#Base octal
int a = 09 

#Base hexadecimal
int b= 0xa

#Notação cientifica 
double d2= 1.2e3d; //1.2x(10x10x10) e=elevado na base 10
	
#Notação cientifica 
float f2= 3e2f; //12x(10x10) e=elevado na base 10

#Argumento do tipo var args
imprimir("Helio","Aline");
public void imprimir(String... nomes) {
		System.out.println("Total: " + nomes.length);
	}

```
`- Uma interface possui Variáveis ou metodos`</br>
`- As variáveis de uma interface são publicas, static e final por padrão`</br>
`- Os metodos de uma interface são abstratos e publicos por padrão`</br>
`- `</br>

`- Não é necessário usar o import para classes que estão no memo pacote`</br>
`- Para importar uma classe de outro pacote, essa classe precisa estar como public`</br>
`- Classes dentro do pacote default não pode ser acessadas por classes em outros pacotes, somente por outras classes dentro do default`</br>
`- Padrão de nomes de pacotes, tudo em minúsculo, nome do site ao contrario, exemplo br.com.google`</br>

`- Ao Importar uma classe 2x com nomes de pacotes distintos, por exemplo: java.util.data e java.sql.data, ou final .* nos 2, o compilador não vai saber qual utilizar, em caso de .* e .data no import, vai utilizar o mais especifico, no caso o .data`</br>
`- O import com final .*, importa as classes e interfaces de um pacote, não importa classes e interfaces de subpacotes`</br>
`- É possivel utilizar o import static, que permite usar os métodos e atributos staticos da classe diretamente. exemplo: import static importar.Util.*;`</br>

`- String: Cria um novo objeto ao invocar o operador +, 1 objeto com a informação e um novo objeto com o resultadp, o objeto anterior perde a referência`</br>
`- StringStringBuffer: Edita o objeto existente com append, de forma sincrona`</br>
`- StringBuilder: Edita o objeto existente com append, de forma assincrona`</br>

`- Modificadores de acesso: public, protect, private, default`</br>
`- Public: qualquer classe dentro ou fora do pacote pode acessar`</br>
`- Protect: qualquer classe dentro  do pacote, ou que herda a classe pode acessar`</br>
`- Default: Qualquer classe do pacote pode acessar`</br>
`- Private: Somente a classe pode usar`</br>

`- Encapsulamento: Setar as variáveis como privadas, disponibilizando o acesso via getter e setter`</br>


## Recursos

- [x] Variável
- [x] Objeto
- [x] Interface
- [x] Classe
- [x] Import
- [x] Argumentos
- [x] StringBuilder vs StringBuffer
- [x] Operador lógico
- [x] Incremento, Decremento
- [x] Array
- [x] Switch
- [x] Laços, continue, break e label nos laços
- [x] Métodos, synchronized 
- [x] Método estático, sobrecarga
- [x] Construtor
- [x] Modificadores de acesso
- [x] Encapsulamento,
- [x] Casting
- [x] Interface, método e classe abstrata
- [x] Herança
- [x] Exceções, TryCatch
- [x] Print
- [x] LocalDateTime, Calendar, Date
- [x] Scanner
- [x] JFrame



## License
MIT License
