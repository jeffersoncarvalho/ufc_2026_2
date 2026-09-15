package br.ufc.quixada.rpg;

public class Battle {

    public void battle(Character characters[]) {
        //chamada polimórfica dos ataques dos personagens!
        for(int i = 0; i < characters.length; i++ ){
            System.out.println(characters[i].attack());
        }
    }

    public void enhacedBattle(Character characters[]) {
        System.out.println("EnemyBoss ENERGY início: " + EnemyBoss.ENERGY);

        for(Character character : characters) {
            System.out.println(character.attack());
        }
        System.out.println("EnemyBoss ENERGY fim: " + EnemyBoss.ENERGY);
    }
}
