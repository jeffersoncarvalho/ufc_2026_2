//EXISTEM DUAS FORMAS DE ACESSAR UMA API EM JS
// 1 - Usando o fetch - nativo do JS
// 2 - Usando a biblioteca axios

//EXISTEM DUAS FORMAS DE TRATAR OS DADOS QUE VEM DE UM
//fetch OU do axios.
// 1 - then/catch (+ antiga, menos recomendado)
// 2 - async + await (+atual, mais recomendado)

function acessarAPI() {
  fetch("https://pokeapi.co/api/v2/pokemon/ditto")
    .then((response) => {
      return response.json();
    })
    .then((dados) => {
      //console.log(dados.sprites.front_default);
      //console.log(dados.name)
      const imagem = document.getElementById("id-img")
      imagem.alt = dados.name
      imagem.src = dados.sprites.front_default
    })
    .catch((error) => {
      console.log("ERRO!!!")
      console.log(error);
    });
}

function acessarAPIComAxios() {
  axios.get("https://pokeapi.co/api/v2/pokemon/pikachu")
  .then(
    (response) => {
      const data = response.data
      const imagem = document.getElementById("id-img")
      imagem.alt = data.name
      imagem.src = data.sprites.front_default
    }
  )
  .catch(error => console.log(error))
}

async function acessarAPIComFetchAsyncAwait(){

  try{
    const response = await fetch("https://pokeapi.co/api/v2/pokemon/49")
    const dados = await response.json()
    const imagem = document.getElementById("id-img")
    imagem.alt = dados.name
    imagem.src = dados.sprites.front_default
  }catch(error){
    console.log(error)
  }

}

async function acessarAPIComAxiosAsyncAwait(){
  try{
    const response = await axios.get("https://pokeapi.co/api/v2/pokemon/51")
    const imagem = document.getElementById("id-img")
    imagem.alt = response.data.name
    imagem.src = response.data.sprites.front_default
  }catch(error){
    console.log(error)
  }

  
}

//acessarAPI()
//acessarAPIComAxios()
//acessarAPIComFetchAsyncAwait()
acessarAPIComAxiosAsyncAwait()
