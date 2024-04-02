//Exercício 1: Personagens de um Jogo
//Crie uma classe Personagem com os atributos encapsulados nome e vida. Em
//seguida, crie duas subclasses: Guerreiro e Mago. Adicione atributos específicos para
//cada uma das subclasses, como arma para o guerreiro e poderMagico para o mago.
//Implemente métodos para definir e obter os valores dos atributos, garantindo
//encapsulamento.

//Exercício 2: Itens de Inventário
//Crie uma classe Item com atributos encapsulados nome e quantidade. Em seguida,
//crie duas subclasses: Armadura e Poção. Adicione atributos específicos para cada uma
//das subclasses, como defesa para a armadura e cura para a poção. Implemente
//métodos para definir e obter os valores dos atributos, garantindo encapsulamento.

//Exercício 3: Terrenos em um Jogo de Estratégia
//Crie uma classe Terreno com um método descrever() que retorna uma descrição do
//terreno. Em seguida, crie subclasses como Floresta, Montanha e Deserto,
//implementando o método descrever() para fornecer uma descrição específica para cada
//tipo de terreno.

//Exercício 4: Classes de Personagens Específicas
//Crie uma classe Personagem com atributos encapsulados nome e pontosVida. Em
//seguida, crie subclasses específicas de classes de personagens de um jogo, como
//Ladino, Arqueiro, Bruxo, cada uma com atributos e métodos específicos que
//representam suas habilidades e características únicas.

//Exercício 5: Criaturas Místicas
//Crie uma classe Criatura com atributos encapsulados nome e poderAtaque. Em
//seguida, crie subclasses como Dragão, Unicórnio e Grifo, cada uma com métodos e
//atributos específicos que representam suas habilidades e características únicas em um
//mundo de fantasia.


import Characters.*;
import Items.Armor;
import Items.Potion;
import Terrains.Desert;
import Terrains.Montains;
import Terrains.Wood;

public class Main {
    Warrior warrior1 =  new Warrior("James");
    Archer archer1 = new Archer("John");
    Mage mage1 = new Mage("Jean");
    Rogue rogue1 = new Rogue("Luisa");
    Warlock warlock1 = new Warlock("Merlin");
    Dragon dragon1 = new Dragon("Alextraza");
    Unicorn unicorn1 = new Unicorn("Laura");
    Griffon griffon1 = new Griffon("Flyion");

    Desert desert1 = new Desert("Orion");
    Wood wood1 = new Wood("Amazônia");
    Montains montains1 = new Montains("Everest");

    Armor armor1 = new Armor("Shield", 100);
    Potion potion1 = new Potion("Mana", 10);

    mage1.usePotion(potion1);
}