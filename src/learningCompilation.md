### _Aprendendo sobre compilação, JVM e como compilar, executar e testar meus projetos_

<div align="center">
  <img src="https://media1.tenor.com/m/nm0AZ0ZGkE0AAAAd/java.gif" alt="Descrição do GIF" width="400">
</div>

Em Java, o código-fonte é compilado pelo `javac` (compilador) para gerar arquivos de bytecode `(.class)`, que serão lidos e interpretados pela JVM (algo legal de saber aqui é que: o código criado em ambiente Linux rodará perfeitamente em Mac ou Windowns, isso porque a JVM instalada no SO é que fará a intepretação do código).


- JRE (Java Runtime Environment): Ambiente necessário para executar programas Java. Inclui a JVM e bibliotecas padrão.
- JDK (Java Development Kit): Conjunto de ferramentas para o desenvolvimento de aplicativos Java, incluindo o javac, bibliotecas, e o JRE.
- JVM (Java Virtual Machine): Máquina virtual responsável por interpretar e executar o bytecode. Ela é específica para o sistema operacional em que está instalada, possui o seu próprio gerenciador de memória e conta com o JIT (Just-In-Time), que converte bytecode em código de máquina para melhorar o desempenho em tempo de execução.

Além disso, outra coisa legal de saber é que o JIT se refere a compilação e intepretação em tempo de execução, ou seja, os bytecodes gerados na compilação são convetidos pela JVM em código de máquina nativa à medida que o programa é executado.

Para compilar e testar os meus projetos eu tenho duas opções: criar Makefiles ou criar scrips bash. Porém, após pesquisar um pouco sobre o tema eu descobri que: Makefiles podem ser mais complexos e até mesmo desnecessários e scripts podem ser mais simples, mas não tanto modularizados e organizados como eu estou acostumada.

Por isso, eu optarei no início em aprender a escrever um Makefile bem modularizado (quero também criar regras para rodar testes JUnit aqui). Posteriormente, quero aprender a criar scripts já que eles são mais simples e podem ser executados por qualquer sistema operacional, desde que eles tenham um shell próprio.

Conteúdos legais sobre o tema:

- https://www.reddit.com/r/devops/comments/z1eegq/makefiles_vs_bash_scripts/
- https://medium.com/@alxkm/how-compilation-works-in-java-0ac4d1e95b99
- https://www.geeksforgeeks.org/compilation-execution-java-program/
- https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jar.html
- https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html
- Uma alternativa ao Makefile: https://taskfile.dev/