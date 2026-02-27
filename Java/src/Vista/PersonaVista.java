package Vista;

import java.util.Scanner;

public class PersonaVista {
    Scanner sc = new Scanner(System.in);

    public String nombreUsuario () {
        System.out.print("Introduce tu nombre completo: ");
        return sc.nextLine();
    }
    public int edadUsuario () {
        System.out.print("Introduce tu edad: ");
        return sc.nextInt();
    }
    public String correoUsuario () {
        System.out.println("Introduce tu correo electronico: ");
        return sc.nextLine();
    }

    public void datosUsuario () {
        System.out.println("== DATOS DEL USUARIO ==");
        System.out.println("Nombre completo: " + nombreUsuario());
        System.out.println("Edad: " + edadUsuario());
        System.out.println("Contacto: " + correoUsuario());
    }

    public void mensajeUsuario (String mensaje) {
        System.out.println(mensaje);
    }
}
