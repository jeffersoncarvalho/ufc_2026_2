const lista = [
  "https://www.quixada.ufc.br/wp-content/uploads/2026/03/Alexandre-1-e1775493896295-199x300.jpeg",
  "https://www.quixada.ufc.br/wp-content/uploads/2015/05/Alisson-Barbosa-de-Souza1-225x300.png",
  "https://www.quixada.ufc.br/wp-content/uploads/2016/02/Andr%C3%A9_Ribeiro_Braga1-225x300.png",
  "https://www.quixada.ufc.br/wp-content/uploads/2015/05/Andreia-225x300.png",
  "https://www.quixada.ufc.br/wp-content/uploads/2015/11/Diana-Braga-226x300.png",
];

let seta = 0;

function modificar_imagem() {
  const professorImg = document.getElementById("professor-img");
  professorImg.src = lista[seta];
}

function voltar() {
  if (seta - 1 < 0) {
    console.log("Valor inválido para seta!");
  } else {
    seta = seta - 1;
    modificar_imagem();
  }
}

function desabilitaBotoes() {
  
  //voltar
  if (seta == 0) {
    const botaoVoltar = document.getElementById("botao-voltar");
    botaoVoltar.disabled = "true";
  } else {
    const botaoVoltar = document.getElementById("botao-voltar");
    botarVoltao.disabled = "false";
  }

  //adiantar
  if (seta == lista.length-1) {
    console.log(seta)
    const botaoAdiantar = document.getElementById("botao-adiantar");
    botaoAdiantar.disabled = "true";
  } else {
    const botaoAdiantar = document.getElementById("botao-adiantar");
    botaoAdiantar.disabled = "false";
  } 
}

function adiantar() {
  if (seta + 1 >= lista.length) {
    console.log("Valor inválido para seta!");
  } else {
    seta = seta + 1;
    modificar_imagem();
  }
}

//desabilitaBotoes()
//modificar_imagem()
