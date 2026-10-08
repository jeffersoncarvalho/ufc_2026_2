function acessarAPI() {
  fetch("https://pokeapi.co/api/v2/pokemocvcvvxn/54")
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

acessarAPI();
