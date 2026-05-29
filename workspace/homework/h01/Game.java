package homework.h01;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //
        int hp = 100;
        int lv = 1;
        int exp = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("your name : ");
        String name = s.next();
        System.out.println("Welcome " + name + "!");
        while(hp > 0) {
            int monsterHp = lv*50;
            System.out.println("Monster : lv)" + lv + " hp)" + monsterHp);
            while(monsterHp > 0) {
                System.out.println("Your action? : 1) attack 2) run 3) heal 4) stat");
                int action = s.nextInt();
                switch (action) {
                    case 1:
                        int damage = (int) (Math.random() * 10 * lv + 1);
                        System.out.println("you got " + damage + " damages to monster");
                        monsterHp -= damage;
                        System.out.println("remain monster hp : " + monsterHp);
                        damage = (int) (Math.random() * 5 * lv + 1);

                        System.out.println("you got " + damage + " damages from monster");
                        hp -= damage;
                        System.out.println("remain hp : " + hp);
                        break;
                    case 2:
                        break;
                    case 3:
                        int heal = (int) (Math.random() * 10 * lv + 1);
                        System.out.println("you got " + heal + " heals");
                        hp += heal;
                        if (hp > 100 + (lv - 1) * 50) {
                            hp = 100 + (lv - 1) * 50;
                        }
                        break;
                    case 4:
                        System.out.println("your level : " + lv + " exp : " + exp);
                        System.out.println("your hp : " + hp);
                        break;
                }
            }
            System.out.println("you beat monster! exp : " + lv*50);
            exp += lv*50;
            if(exp >= lv*50) {
                lv++;
                exp = 0;
            }
        }
        System.out.println("game over");
    }
}
