package Homework.lesson6;
/**Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 Создать множество ноутбуков.
 Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 “Введите цифру, соответствующую необходимому критерию:
 1 - ОЗУ
 2 - Объем ЖД
 3 - Операционная система
 4 - Цвет …
 Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 **/

import java.util.HashSet;
import java.util.Set;


public class Base {
    public static HashSet<Laptop> laptopList() {
        Laptop lap1 = new Laptop("ASUS","Vivobook 17",111);
        lap1.setColor("серебристый");
        lap1.setOS("Windows 11");
        lap1.setRamSize(12);
        lap1.setHddSize(1024);

        Laptop lap2 = new Laptop("ASUS"," F515JA",112);
        lap2.setColor("серебристый");
        lap2.setOS("Без ОС");
        lap2.setRamSize(8);
        lap2.setHddSize(512);

        Laptop lap3 = new Laptop("Lenovo"," IdeaPad Gaming 3",113);
        lap3.setColor("черный");
        lap3.setOS("Windows 11");
        lap3.setRamSize(8);
        lap3.setHddSize(512);

        Laptop lap4 = new Laptop("Samsung","NP750",114);
        lap4.setColor("серебристый");
        lap4.setOS("Windows 11");
        lap4.setRamSize(8);
        lap4.setHddSize(256);

        Laptop lap5 = new Laptop("MacBook","Air M2",115);
        lap5.setColor("алюминий");
        lap5.setOS("Windows 11");
        lap5.setRamSize(16);
        lap5.setHddSize(512);

        Laptop lap6 = new Laptop("HP","15s-eq2018ur",116);
        lap6.setColor("серебристый");
        lap6.setOS("Windows 11");
        lap6.setRamSize(16);
        lap6.setHddSize(512);

        HashSet<Laptop> laptops;
        laptops = new HashSet<>(Set.of(lap1, lap2, lap3, lap4, lap5, lap6));
        return laptops;
    }
}
