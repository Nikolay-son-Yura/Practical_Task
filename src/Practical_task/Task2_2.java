package Practical_task;
//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
import java.util.Arrays;

public class Task2_2 {
    public static void printLine() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] arrayData = removingElements(json);
        for (String arrayDatum : arrayData) {
            String[] arrData = arrayDatum.split(",");
            System.out.println(concatenationOfArrays(Arrays.toString(arrData)));
        }
    }

    public static String[] removingElements(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        String[] arrayData;
        arrayData = line5.split(" ");
        return arrayData;
    }
    public static StringBuilder concatenationOfArrays(String line) {
        StringBuilder result = new StringBuilder();
        String [] arrayData = line.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}







