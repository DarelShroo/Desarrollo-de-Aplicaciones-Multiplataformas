import java.util.Scanner;

public class EcuacionGrado2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("\nIntroduce el coeficiente A ");
        int A = Input.nextInt();

        System.out.println("\nIntroduce el coeficiente B ");
        int B = Input.nextInt();

        System.out.println("\nIntroduce el coeficiente C ");
        int C = Input.nextInt();
        int OperationSquare;
        int Positive;
        int Negative;
        if (B==0){
            OperationSquare = (int)Math.sqrt((C*(-1))/B);
        }else{
            OperationSquare = (int)Math.sqrt(B*B + (-4 *A*C));

            Positive = (B * (-1) + OperationSquare) / (A * 2);
            Negative = (B * (-1) - OperationSquare) / (A * 2);
        }

        System.out.println("\nPrimera solución da como resultado " + Positive);

        if (Negative == 0) {
            System.out.println("\nSu segunda solución es 0");
        } else {
            System.out.println("\nSu segundo resultado es " + Negative + 
            " por lo que solo tiene una solución real\n");
        }
    }
}
