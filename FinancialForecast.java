/* Recursion : a function calls itself to solve smaller subprograms*/
public class FinancialForecast{
    public static double FutureValue(double principal, double rate, int years){
        if(years==0){
            return principal;
        }
        return (1+rate)*FutureValue(principal,rate,years-1);
    }
    public static void main(String[] args){
        double principal=198200;
        double rate=0.05;
        int years=6;
        double result=FutureValue(principal,rate,years);
        System.out.printf("Future Value becomes: %.2f", result);
    }
}