# Atividade Prática: Passa-Pokémon

**Disciplina:** Programação para a WEB
**Tecnologias:** HTML, CSS e JavaScript
**Modalidade:** Individual

---

## 1. Objetivo

Praticar a construção de uma página web simples que una:

- **HTML semântico** para estruturar o conteúdo;
- **CSS com Flexbox** para alinhar e centralizar elementos;
- **JavaScript** para manipular o DOM e reagir a eventos de clique.

Ao final, você terá um pequeno "álbum" que permite navegar pelas imagens dos primeiros Pokémon, um por vez.

---

## 2. Contexto

O site [PokéAPI](https://pokeapi.co/) disponibiliza, de forma gratuita, dados e imagens de Pokémon. É possível acessar a imagem (sprite) de um Pokémon específico por meio de uma URL com o seguinte padrão:

```
https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png
```

Observe que o **número no final da URL** identifica o Pokémon. No exemplo acima, o número `132` corresponde a um Pokémon específico. Para acessar outro, basta trocar esse número:

| URL (final)  | Pokémon exibido |
|--------------|-----------------|
| `.../1.png`  | Pokémon nº 1    |
| `.../9.png`  | Pokémon nº 9    |
| `.../10.png` | Pokémon nº 10   |

Essa é a ideia central da atividade: **alterar o número na URL da imagem para navegar entre os Pokémon**.

---

## 3. Arquivos a serem criados

Crie **dois arquivos** na mesma pasta:

| Arquivo              | Função                                                   |
|----------------------|----------------------------------------------------------|
| `passa-pokemon.html` | Estrutura da página e estilos CSS (dentro do `<head>`)   |
| `passa-pokemon.js`   | Lógica de navegação entre os Pokémon                     |

> O arquivo HTML **deve importar** o arquivo JavaScript (por meio da tag `<script>`).

```
📁 atividade-passa-pokemon/
├── passa-pokemon.html
└── passa-pokemon.js
```

---

## 4. Requisitos

### 4.1 Estrutura e estilo (HTML + CSS)

1. Utilize **HTML semântico** (por exemplo: `<header>`, `<main>`, `<footer>`, entre outras tags apropriadas).
2. Os estilos devem ser escritos em uma folha de estilo **dentro do `<head>`** (tag `<style>`), utilizando **Flexbox** para o posicionamento dos elementos.
3. **Topo (header):** deve conter um título de sua escolha.
4. **Conteúdo (main):**
   - A imagem de um Pokémon deve aparecer **centralizada na tela**;
   - A imagem deve estar dentro de um **"card" com bordas**, funcionando como moldura, conforme visto em sala de aula;
   - **Logo abaixo da imagem**, também centralizados, devem aparecer **dois botões** com os rótulos (labels) **VOLTAR** e **AVANÇAR**.
5. **Rodapé (footer):** deve conter as informações do aluno:
   - Nome;
   - Matrícula;
   - E-mail.
6. Você tem **liberdade total** para estilizar o restante do site (cores, fontes, espaçamentos, sombras, etc.).

### 4.2 Comportamento (JavaScript)

1. Ao carregar a página, deve ser exibido um Pokémon inicial (sugestão: o de número 1).
2. **Botão VOLTAR:** ao ser clicado, exibe o Pokémon **anterior** (uma unidade a menos).
   *Exemplo:* se o Pokémon 9 está sendo exibido, passa a ser exibido o Pokémon 8.
3. **Botão AVANÇAR:** ao ser clicado, exibe o **próximo** Pokémon (uma unidade a mais).
   *Exemplo:* se o Pokémon 9 está sendo exibido, passa a ser exibido o Pokémon 10.
4. **Dica:** para trocar de Pokémon, basta alterar o número no final da URL da imagem (atributo `src` da tag `<img>`).

### 4.3 Limites de navegação

| Situação                                                    | Comportamento esperado                                             |
|-------------------------------------------------------------|--------------------------------------------------------------------|
| Pokémon nº **1** sendo exibido e o usuário clica em VOLTAR  | Exibir um `alert` informando que é **impossível voltar**          |
| Pokémon nº **10** sendo exibido e o usuário clica em AVANÇAR | Exibir um `alert` informando que é **impossível avançar**         |

- O **limite inferior** é o Pokémon de número **1**.
- O **limite superior** é o Pokémon de número **10**.
- Nos casos acima, a imagem **não deve mudar**.

---

## 5. Esboço da interface (sugestão)

```
┌──────────────────────────────────────────┐
│               TÍTULO DO SITE             │   ← header
├──────────────────────────────────────────┤
│                                          │
│              ┌────────────┐              │
│              │            │              │
│              │   IMAGEM   │              │   ← card com borda
│              │  POKÉMON   │              │
│              │            │              │
│              └────────────┘              │
│                                          │
│           [ VOLTAR ] [ AVANÇAR ]         │   ← botões centralizados
│                                          │
├──────────────────────────────────────────┤
│  Nome do aluno | Matrícula | E-mail      │   ← footer
└──────────────────────────────────────────┘
```

---

## 6. Dicas de implementação

- Use um `id` na tag `<img>` e em cada botão para localizá-los no JavaScript (por exemplo, com `document.getElementById`).
- Guarde o número do Pokémon atual em uma **variável** no JavaScript.
- Use o evento de **clique** (`addEventListener("click", ...)` ou o atributo `onclick`) para reagir aos botões.
- Monte a URL da imagem concatenando (ou usando *template string*) a parte fixa da URL com o número do Pokémon atual.
- Antes de alterar o número, **verifique o limite** (menor que 1 ou maior que 10). Só atualize a imagem se a navegação for permitida.
- Para centralizar com Flexbox, lembre-se das propriedades `display: flex`, `justify-content`, `align-items` e `flex-direction`.
- Teste o site abrindo o arquivo `passa-pokemon.html` diretamente no navegador e use o console do navegador (F12) para depurar possíveis erros.

---

## 7. Checklist de conferência

Antes de entregar, verifique se:

- [ ] Os arquivos se chamam exatamente `passa-pokemon.html` e `passa-pokemon.js`;
- [ ] O HTML importa o arquivo JavaScript;
- [ ] Foram usadas tags semânticas (`header`, `main`, `footer`);
- [ ] O CSS está dentro do `<head>` e utiliza Flexbox;
- [ ] A imagem está centralizada e dentro de um card com bordas;
- [ ] Os botões **VOLTAR** e **AVANÇAR** estão logo abaixo da imagem, centralizados;
- [ ] VOLTAR e AVANÇAR alteram corretamente o Pokémon exibido;
- [ ] Ao tentar voltar do Pokémon 1, um `alert` é exibido;
- [ ] Ao tentar avançar do Pokémon 10, um `alert` é exibido;
- [ ] O rodapé contém nome, matrícula e e-mail do aluno.

---

## 8. Critérios de avaliação (sugestão)

| Critério                                                        | Pontos  |
|-----------------------------------------------------------------|---------|
| Estrutura HTML semântica e importação correta do arquivo JS     | 2,0     |
| Uso de CSS com Flexbox e centralização dos elementos            | 2,0     |
| Card com bordas e estilização geral do site                     | 1,5     |
| Funcionamento dos botões VOLTAR e AVANÇAR                       | 2,0     |
| Tratamento dos limites (1 e 10) com `alert`                     | 1,5     |
| Rodapé com as informações do aluno                              | 0,5     |
| Organização e legibilidade do código                            | 0,5     |
| **Total**                                                       | **10,0**|

---

## 9. Entrega

Entregue os arquivos `passa-pokemon.html` e `passa-pokemon.js` conforme as orientações do professor (por exemplo, compactados em `.zip` ou por meio do ambiente virtual da disciplina).

---

## 10. Desafios extras (opcional)

Para quem quiser ir além:

- Exibir o **número** (e, se desejar, o **nome**) do Pokémon abaixo da imagem;
- Adicionar um efeito de transição ou *hover* nos botões;
- Desabilitar visualmente o botão quando o limite for atingido, em vez de usar `alert`;
- Tornar a página responsiva para telas de celular.

Bom trabalho! ⚡
