# Refatoração de projetos open source com padrões de projetos

# *Projeto Sistema de Cursos de @danilo-aalmeida*

Projeto original https://github.com/danilo-aalmeida/SistemaDeCursos

Sua refatoração está na pasta Design https://github.com/soficastro/DesignPatternRefact/tree/master/Design

- *Padrões usados*

-> *Builder*

Nas classes Curso e Turma

-> *Singleton*

Nas classes CadastrarCurso, CadastrarPessoa, CadastrarTurma, GerarBalanco, pois foi verificado que estas classes só podiam
apresentar uma instância, ou seja, só pode haver um objeto de cada uma dessas classes. Assim, garantimos que isso ocorra de fato.

# Projeto 

Projeto original

