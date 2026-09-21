function diana() {
    const diana = document.getElementById("id-diana")
    if(!diana.classList.contains("escondido"))
        diana.classList.add("escondido")
}
function ingrid() {
    const ingrid = document.getElementById("id-ingrid")
    if(!ingrid.classList.contains("escondido"))
        ingrid.classList.add("escondido")
}
function joao() {
    const joao = document.getElementById("id-joao")
    if(!joao.classList.contains("escondido"))
        joao.classList.add("escondido")
}

function mostrar() {
    const diana = document.getElementById("id-diana")
    const ingrid = document.getElementById("id-ingrid")
    const joao = document.getElementById("id-joao")

    diana.classList.remove("escondido")
    ingrid.classList.remove("escondido")
    joao.classList.remove("escondido")

}