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
public class Laptop {
    private Integer RAM;
    private Integer HDD;
    private final String brand;
    private final String model;
    private String color;
    private final Integer id;
    private String OS;

    public Laptop(String brand, String model, Integer id) {
        this.brand = brand;
        this.model = model;
        this.id = id;
    }
    public Integer getRamSize(){
        return this.RAM;
    }
    public Integer getHddSize(){
        return this.HDD;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }public Integer getId(){
        return this.id;
    }public String getOS(){
        return this.OS;
    }
    public void setRamSize(Integer RAM){
        this.RAM=RAM;
    }
    public void setHddSize(Integer HDD){
        this.HDD=HDD;
    }
    public String setBrand(String brand){
        return this.brand;
    }
    public String setModel(String model){
        return this.model;
    }
    public void setColor(String color){
        this.color =color;
    }
    public Integer setId(Integer id){
        return this.id;
    }public void setOS(String OS){
        this.OS=OS;
    }
    @Override
    public String toString() {
        return String.format("Ноутбук № %s \n Производитель : %s \n Модель : %s \n Цвет : %s\n Операционная система : %s\n Жесткий диск : %s Гб\n Оперативная память : %s Гб",id,brand,model,color,OS,HDD,RAM);
    }



}
