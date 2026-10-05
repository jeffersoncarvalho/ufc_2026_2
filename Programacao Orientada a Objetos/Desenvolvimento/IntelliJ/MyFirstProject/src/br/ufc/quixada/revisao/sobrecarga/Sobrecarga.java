package br.ufc.quixada.revisao.sobrecarga;

public class Sobrecarga {

    /*
    * Sobrecarga de métodos (method overloading) é a possibilidade d
    * e definir vários métodos com o mesmo nome dentro da mesma classe,
    * desde que suas listas de parâmetros sejam diferentes
    * */

    //Sobrecarga de construtores
    public Sobrecarga(){
        //inicializar os variáveis de instância com valores padrão
    }
    //primeira versão sobrecarregada
    public Sobrecarga(int x, int y){
        x = 10;
        y = 20;
        int soma  = x + y;
        System.out.println("Soma: " + soma);
    }
    public Sobrecarga(int a, float b){

    }
    public Sobrecarga(float a, int b){

    }
    public Sobrecarga(char c, int i, String s, int[] numeros){

    }
    //e os métodos?
    public int soma(int x, int y){
        return x + y;
    }
    //ATENÇÃO: mudar apenas o tipo de retorno, não é sobrecarga!]
    //o código abaixo está incorreto, se descomentar o segundo método!
    public int soma(float x, float y){
        return 10;
    }
    /*public float soma(float x, float y){
        return 10;
    }*/
}
