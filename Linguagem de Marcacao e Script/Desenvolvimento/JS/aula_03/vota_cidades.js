//vota cidades

const cidades = {
    fortaleza:0,
    quixada:0,
    sobral:0,
    crateus:0
}

function carregarVotos() {
    const votosFortaleza = document.getElementById("votos-fortaleza")
    const votosQuixada = document.getElementById("votos-quixada")
    const votosSobral = document.getElementById("votos-sobral")
    const votosCrateus = document.getElementById("votos-crateus")

    votosFortaleza.innerText = cidades.fortaleza
    votosQuixada.innerText = cidades.quixada 
    votosSobral.innerText = cidades.sobral
    votosCrateus.innerText = cidades.crateus
}

function inserirVoto(cidade) {
    
    if(cidade === "fortaleza") {
        cidades.fortaleza = cidades.fortaleza + 1
    }else if (cidade === "quixada") {
        cidades.quixada = cidades.quixada + 1
    }else if (cidade === "sobral") {
        cidades.sobral = cidades.sobral + 1
    }else {
        cidades.crateus = cidades.crateus + 1
    }

    carregarVotos()
}

carregarVotos()