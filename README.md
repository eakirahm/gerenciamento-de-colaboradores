# Mentoria: Abstraindo situações do mundo real com Orientação a Objetos

O objetivo principal é colocar em prática umas das principais ferramentas da OO: <strong>ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA, COMPOSIÇÃO E POLIMORFISMO</strong> através de um projeto Java. </p>

## Desafio

<p>Modelar as entidades de uma aplicação de <strong>Gerenciamento de Colaboradores</strong> de uma loja.<br>
Dentre as outras funcionalidades (as quais você não precisará implementar), esse sistema terá a funcionalidade de calcular a bonificação dos colaboradores dessa loja seguindo as seguintes regras:</p>

<ul>
    <li>Vendedor é um Funcionário CLT e tem o benefício de bonificação.</li>
    <li>Operador de Caixa é um funcionário CLT, mas não tem o benefício da bonificação.</li>
    <li>Gerente não é um Funcionário CLT, mas tem o benefício da bonificação.</li>
</ul>

<h3>Colaboradores</h3>
<ol>
    <li>Vendedor:</li> nome, documento, salario e valor da bonificação.
    <li>Operador de Caixa:</li> nome, documento e salario.
    <li>Gerente:</li> nome, cnpj, remuneracao e valor da bonificação.
</ol>