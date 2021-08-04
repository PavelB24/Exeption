package ru.gb;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int x, int y) {
        super(String.format("Ошибка в ячейке [%d][%d] ", x, y));
//    public String getMessage(){
//        return "В мессиве лежит нечисловое значение!";
    }
}
