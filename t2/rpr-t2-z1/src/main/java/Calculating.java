import static java.lang.Math.pow;

public class Calculating {

    public static long factorijel(int number) {
        int result=1;
        for(int i=1; i<=number; i++){
            result = result * i;
        }
        return result;
    }
    public static double sinus(int number) {
        double suma=0;
        for(int i=1; i<10; i+=2){
            if(i%2!=0) {
                suma+=pow(number, i)/factorijel(i);
            }
            else{
                suma-=pow(number, i)/factorijel(i);
            }
        }
        return suma;
    }
}
