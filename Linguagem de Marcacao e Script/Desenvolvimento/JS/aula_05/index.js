async function acessarAPICovid() {

    const response = await fetch("https://covid19-brazil-api.vercel.app/api/report/v1/brazil/uf/ce")
    const dados = await response.json()

    const idEstado = document.getElementById("id-estado")
    const idSigla = document.getElementById("id-sigla")
    const idCasos = document.getElementById("id-casos")
    const idMortos = document.getElementById("id-mortos")
    const idSuspeitos = document.getElementById("id-suspeitos")

    idEstado.innerHTML = dados.state
    idSigla.innerHTML = dados.uf
    idCasos.innerHTML = dados.cases
    idMortos.innerHTML = dados.deaths
    idSuspeitos.innerHTML = dados.suspects
}

function acessarAPIThenCatch() {
    fetch("https://covid19-brazil-api.vercel.app/api/report/v1/brazil/uf/sp")
    .then(response => response.json())
    .then((dados) => {
        const idEstado = document.getElementById("id-estado")
        const idSigla = document.getElementById("id-sigla")
        const idCasos = document.getElementById("id-casos")
        const idMortos = document.getElementById("id-mortos")
        const idSuspeitos = document.getElementById("id-suspeitos")

        idEstado.innerHTML = dados.state
        idSigla.innerHTML = dados.uf
        idCasos.innerHTML = dados.cases
        idMortos.innerHTML = dados.deaths
        idSuspeitos.innerHTML = dados.suspects
    })
    .catch((error)=>console.log(error))
}

//acessarAPICovid()
acessarAPIThenCatch()