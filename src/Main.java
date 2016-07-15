import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Hello World!");

        int Codigo,Litros;
        double Precio;

        double ImporteFactura;

        double FacturacionTotal=0;

        int LitrosProd1=0;

        int MasDe600=0;

        for (int i=0; i<=5; i++)
        {
            System.out.println("INTRODUCE LOS DATOS DE LA FACTURA " +i +": ");
            System.out.println("- Codigo de la factura " +i +": ");
            Codigo=sc.nextInt();
            System.out.println("- Cantidad de litros en la factura " +i +": ");
            Litros =sc.nextInt();
            System.out.println("- Precio por litro de la factura " +i +": ");
            Precio=sc.nextDouble();

            ImporteFactura=Precio*Litros;

            FacturacionTotal+=ImporteFactura;

            if (Codigo==1)
                LitrosProd1++;

            if (ImporteFactura>600)
                MasDe600++;
        }
        System.out.println("La facturación total es de: " +FacturacionTotal +" euros. ");
        System.out.println("La cantidad de litros del producto 1 es: " +LitrosProd1);
        System.out.println("La cantidad de facturas superiores a 600 euros: " +MasDe600);


    }
}
