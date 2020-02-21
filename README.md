## Questão 01 [Telefone]:
João, um cara muito extrovertido, acabou se envolvendo em algumas brincadeiras e levou uma suspensão. Como castigo, sua mãe (uma médica muito conhecida) resolveu lhe dar uma tarefa um tanto quanto chata. 

Dois dias antes da suspensão de João, sua mãe havia formatado seu celular e perdido todos os contatos de seus clientes, lhe restando somente uma agenda antiga onde tinha todos os números anotados. 

A missão de João foi ligar para todos aqueles números e confirmar os nomes e reestruturar a agenda de sua mãe. 

Sua mãe, uma mulher mais velha e não adepta a tecnologia, havia sugerido que ele anotasse em um papel. Já João, jovem programador (início de carreira), resolveu criar um serviço que pudesse lhe auxiliar. 

Pois bem, este serviço que João criou consiste em um CRUD. Onde ele anota nome, telefone e a data. 

Como João ainda é um pequeno iniciante na área de desenvolvimento pode haver alguns erros e melhorias a se fazer neste código, além dos testes unitários que não realizou. Você pode ajuda-lo a sair do castigo?

Estrutura:

Insert novo registro:
```
{
    "telefone": 984716103,
    "nome": "Maria",
    "data": "20/02/2020"
}
```
Update registro:
```
{
    "id":5
    "telefone": 984716103,
    "nome": "Maria123",
    "data": "20/02/2020"
}
```
Delete registro:
```
{
    "id":5
    "telefone": 984716103,
    "nome": "Maria123",
    "data": "20/02/2020"
}
```

Observação: O coverage atingiu somente 14%. Continue realizando os testes.

## Questão 02 [apiRest]

Uma professora, muito dedicada, trabalha em uma escola que não possui internet. Portanto para se auto organizar e lançar as notas no sistema em outro momento (quando tiver acesso a internet) ela guarda os dados dos alunos em um excel. 

Vamos pensar no sistema que esta professora utiliza:
Imaginemos que existe uma interface (frontend) que coleta este arquivo (.xls, .csv) com os dados dos alunos e os transforma em json, que é o que recebemos no backend. 

Para inserir os dados no sistema a estrutura é a seguinte:
```
[
    {
        "matricula": "160146232",
        "nomeAluno": "thay",
        "notaPortugues": 5.5,
        "notaMatematica": 6.7,
        "notaCiencias": 2.3,
        "notaHistoria": 5.6,
        "bimestre": 1
    },
    {
        "matricula": "12345678",
        "nomeAluno": "maria",
        "notaPortugues": 5.5,
        "notaMatematica": 6.7,
        "notaCiencias": 2.3,
        "notaHistoria": 5.6,
        "bimestre": 1
    }
]    
```
Este serviço já calcula, baseado nas notas, se o aluno está de recuperação ou não (considerando notas >= 5 como aprovado).

Este serviço precisa de melhorias, analise e as faça como achar melhor.

## Questão 03 [controleFuncionario]
Um programador, de uma pequena software house, começou a trabalhar em um novo projeto. Este projeto se resume em um CRUD, onde o funcionário responsável pelas férias/salário poderá usar. Porém, este programador teve um problema e precisou se ausentar.

Você precisa continuar este projeto e entrega-lo dentro do prazo. 

O CRUD já está feito e funcionando, mas o funcionário que irá utilizar o sistema precisa de mais funcionalidades que as já existentes.
Se você fosse o funcionário que fosse trabalhar com o sistema. Como poderia melhorar?Como você poderia testar as funcionalidades existentes e as novas?

Faça as melhorias como achar melhor.

Para inserir os dados:
````
   {
        "nome": "thay",
        "salario": 4567.0,
        "ferias": 27
    }
````

