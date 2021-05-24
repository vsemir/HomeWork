package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private static String name_Player;
    private static int hp_Player = 10;
    private static int hp_Player_def = 10;
    private static int dmg_Player = 3;
    private static int def_Player = 1;
    private static int def_Player_def = 1;
    private static int point_Player = 0;
    private static int money_Player = 0;

    private static int hp_Enemy = 5;
    private static int hp_Enemy_def = 5;
    private static int dmg_Enemy = 1;
    private static int def_Enemy = 0;
    private static int def_Enemy_def = 0;

    public static Random random = new Random();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Добро пожаловать в мою игру тут правила просты и это выжить!\n" +
                "Есть комната и из нее 3 выхода, потому что за вами дверь закрываеться наглухо,\n" +
                "а это значит что выбор направления лиш 3. чтобы продвинутся нажимайте 1, 2 или 3 когда спрашивают номер следующий двери.");
        System.out.println();
        System.out.println("В одном большом городе, жил один среднестатистический-ничем-не-примечательный паренек. \n" +
                "Из родствеников и близких у него был воспитавший его друг умершего отца (никому не известный, даже отцу).\n" +
                "И вот однажды к нему подходит измученный и израненный путник. И говорит: — Ты — избранный!!!\n" +
                "Но вы очень удивились. Тогда пришелец говорит: — Беги, прячься скорее, ОHИ идут за тобой.\n" +
                "Герой со свистом покидает родные места. Он бежит куда глаза глядят.\n" +
                "Вскоре вы понимаете что забрели в какието котокомбы и путь лишь один идти вперет!\n Удачи!" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_YELLOW + "Введите имя игрока" + ANSI_RESET);
        name_Player = in.nextLine();
        nextLevel();
        System.out.println();
        System.out.println(ANSI_PURPLE + "Увы! Вы проиграли. Попробуйте снова\nРезультат:");
        System.out.println("Пройденых комнат: " + point_Player + " |Монет: " + money_Player + ANSI_RESET);
    }

    private static void nextLevel(){
        if (point_Player == 0){
            int a = random.nextInt(2);
            printBoard(a);
            point_Player++;
        }
        while (hp_Player > 0){
            System.out.println(ANSI_RED + "номер следующей двери" + ANSI_RESET);
            int numberDoor = in.nextInt();
            if (numberDoor > 3 || numberDoor <= 0){
                System.out.println(ANSI_YELLOW + "вы нажали не ту цифру а значит откроеться случайная двер. Наслаждайтесь выбором" + ANSI_RESET);
            }
            int a = random.nextInt(3);
            expPlayer();
            printBoard(a);
            if (a==2){
                System.out.println(ANSI_YELLOW + "Войдя в комнату вы видите сундук, открыв который можно найти немного монет которые возможно пригодяться в будущем." + ANSI_RESET);
                money_Player += random.nextInt(10);
            }
            battle();
            point_Player++;
        }
    }

    private static void expPlayer(){
        if (point_Player % 3 == 0) {
            System.out.println(ANSI_YELLOW + "Поздравляем! Войдя в комнату вы видете перед собой 2 педистала на первом меч на втором щит. Чутье подсказывает что можно взять только один предмет. Какой вы выбирете?" + ANSI_RESET);
            int n = in.nextInt();
            if (n == 1){
                System.out.println(ANSI_YELLOW + "Подняв меч вы почувствовали прилив сил, как будто сам Арес дал вам свое богославление! Повернувшись вы не смогли увидеть другой педистал." + ANSI_RESET);
                dmg_Player += 3;
            }else if (n == 2){
                System.out.println(ANSI_YELLOW + "Подняв щит вы почувствовали прилив сил, как будто сама богиня Диана дала вам свое богославление! Повернувшись вы не смогли увидеть другой педистал." + ANSI_RESET);
                def_Player_def += 2;
                def_Player = def_Player_def;
            }else{
                System.out.println(ANSI_YELLOW + "Увы но вы не успели сделать выбр и теперь оба педистала исчезли как будто их и не было." + ANSI_RESET);
            }
        }
        if (point_Player % 6 == 0){
            System.out.println(ANSI_YELLOW + "Войдя в комнату вы обнаружили фонтан, чей источник так завораживающе манил вас и войдя в него вы почувствовали как раны и ушибы прошли, и мышцы укрепились." + ANSI_RESET);
            hp_Player_def += 5;
            hp_Player = hp_Player_def;
        }
        if (point_Player % 10 == 0){
            System.out.println(ANSI_YELLOW + "В комнате стоял стойкий запох смрады. Похоже чем глубже идти тем сильнее противник." + ANSI_RESET);
            hp_Enemy_def += random.nextInt(10);
            def_Enemy_def += random.nextInt(5);
            def_Enemy = def_Enemy_def;
            dmg_Enemy += random.nextInt(7);
        }
    }

    private static void battle(){
        while (hp_Enemy > 0 && hp_Player > 0){
            dmgPlayer();
            dmgEnemy();
        }
        if (hp_Enemy <= 0){
            hp_Enemy = hp_Enemy_def;
            def_Player = def_Player_def;
            def_Enemy = def_Enemy_def;
        }
    }

    private static void printBoard(int a){
        int[][] arr = new int[5][5];
        String[] roomInfo = {"В стенах сверкают залежи кристаллов, отражая свет как миллион звёзд.",
                "К штукатурке прибито несколько сотен крысиных шкурок. В ржавом ведре лежат крысиные кости.",
                "Мусор, разбросанный вокруг кострища, намекает, что недавно в этой комнате отдыхали искатели приключений.",
                "Здесь ничто не отбрасывает тени, несмотря ни на какие источники света.",
                "С украшенного фреской потолка скалится ухмыляющийся дьявольский череп.",
                "За взломанной потайной дверью виден обвалившийся коридор",
                "Стены и потолок украшают сотни переплетённых костей.",
                "Все поверхности в комнате закопчены каким-то огромным взрывом.",
                "Каждый квадратный сантиметр пола покрыт нечестивыми письменами, написанными кровью.",
                "Корни, проросшие сквозь потолок, скрывают барельеф божества хитрости на стене.",
                "С потолка, покрытого минералами, срываются капли воды, попадающие в подставленное ведро.",
                "На стенах выжжены силуэты кричащих человеческих лиц.",
                "Кто-то небрежно заложил кирпичами вторую дверь в дальнем углу комнаты.",
                "В этой комнате так долго никого не было, что из-за паутины не видно потолка.",
                "Когда-то здесь была галерея, но сейчас на стенах видны лишь контуры от картин и гвозди." };
        System.out.println(ANSI_YELLOW + "Войдя в комнату вы видете, что " + roomInfo[random.nextInt(roomInfo.length)] + ANSI_RESET);
      for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if((i < 2 && j ==0) || (j < 2 && i ==0) || (j == 0 && i >2) || (j > 2 && i == 0) || (i < 2 && j == arr.length-1) || (j < 2 && i == arr.length-1) || (j == arr.length-1 && i >2) || (j > 2 && i == arr.length-1)){
                   System.out.print(ANSI_BLACK + " \u2588" + ANSI_RESET);
               }else if (i == arr.length/2 +1 && j == arr.length/2 ){
                   System.out.print(ANSI_GREEN + "\u202F\u265F" + ANSI_RESET);
               }else {
                   System.out.print(" \u0020");
               }
                if (i == arr.length/2 && j == arr.length/2-1){
                    switch (a){
                        case 1:
                            System.out.println(ANSI_RED + "\u202F\u2656" + ANSI_RESET);
                            break;
                        case 2:
                            System.out.println(ANSI_BLUE + "\u202F\u26F6" + ANSI_RESET);
                            break;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(ANSI_CYAN + "Пройденых комнат: " + point_Player + " |Монет: " + money_Player + ANSI_RESET);
        System.out.println(ANSI_GREEN + name_Player + " |HP " + hp_Player + " |DMG " + dmg_Player  + " |DEF " + def_Player + ANSI_RESET);
        if (a==1){
            System.out.println(ANSI_RED + "Враг |HP" +hp_Enemy + " |DMG " + def_Enemy  + " |DEF " + def_Enemy + ANSI_RESET);
        }
    }

    private static int dmgPlayer(){
        if (def_Enemy > 0){
            def_Enemy -= dmg_Player;
            return def_Enemy;
        }else {
         hp_Enemy -= dmg_Player;
         return hp_Enemy;
        }
    }

    private static int dmgEnemy(){
        if (def_Player > 0){
            def_Player -= dmg_Enemy;
            return def_Player;
        }else {
            hp_Player -= dmg_Enemy;
            return hp_Player;
        }
    }
}
