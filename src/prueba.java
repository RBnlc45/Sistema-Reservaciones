
import Controlador.ctrlVistaEmpresa;
import Controlador.ctrlVistaPropietario;
import Modelo.Listas.ListaPropietarios;
import Vista.vistaEmpresa;
import Vista.vistaPropietarios;
import java.util.Date;


public class prueba {
    public static void main(String[] args) {
        ctrlVistaEmpresa ctrl;
        ctrl = new ctrlVistaEmpresa(new vistaEmpresa());
        
        /*Date f1=new Date(2021-1900, 2, 12);//inicio
        Date f2=new Date(2021-1900, 2, 15);//final
        Date f3=new Date(2021-1900, 1, 17);//inicio2
        Date f4=new Date(2021-1900, 2, 19);//final 2
        System.out.println(((f3.before(f1)||f3.equals(f1))&&(f4.after(f2)||f4.equals(f2)))||((f3.before(f1)||f3.equals(f1))&&f4.after(f1)&&(f4.before(f2)||f4.equals(f2)))||((f3.after(f1)||f3.equals(f1))&&(f4.before(f2)||f4.equals(f2)))||(f3.after(f1)&&(f3.before(f2)||f3.equals(f2))&&f4.after(f2)));
        System.out.println((f3.after(f1)&&f4.after(f2)));*/
        /*Date f1=new Date(0, 0, 1, 12, 0,0);//inicio
        Date f2=new Date(0, 0, 1, 13, 0,0);//final
        Date f3=new Date(0, 0, 1, 12, 0,0);//inicio2
        Date f4=new Date(0, 0, 1, 13, 0,0);//final 2
        System.out.println((((f3.before(f1)||f3.equals(f1))&&(f4.after(f2)||f4.equals(f2)))||((f3.before(f1)||f3.equals(f1))&&f4.after(f1)&&(f4.before(f2)||f4.equals(f2)))||((f3.after(f1)||f3.equals(f1))&&(f4.before(f2)||f4.equals(f2)))||(f3.after(f1)&&(f3.before(f2)||f3.equals(f2))&&f4.after(f2))));
    */}
 
}
