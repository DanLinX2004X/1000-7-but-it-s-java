public class Gul{
  public static void main(String[] args){

    int a = 1000;
    int b = 7;

    while(true) { //Вызов бесконечного цикла (для неё обязателен break для остановки)
      if(a > 0) {
        System.out.println(a - b); // результат 1000-7
        a -= b; // уменьшение числа a на b раз (тоесть 1-ый раз 1000-7, второй раз 993-7 и тд.)
      } else { // если переменная a будет НЕбольше нуля, цикл будет остановлен
        break;
      }
    }
  }
}
