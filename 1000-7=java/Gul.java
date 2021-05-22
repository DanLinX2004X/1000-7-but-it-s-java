public class Gul{
  public static void main(String[] args){

    int a = 1000;
    int b = 7;

    while(true) {
      if(a > 0) {
        System.out.println(a - b);
        a -= b;
      } else {
        break;
      }
    }
  }
}
