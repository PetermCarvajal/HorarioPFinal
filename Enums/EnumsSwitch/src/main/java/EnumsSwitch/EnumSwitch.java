package EnumsSwitch;
//Tenia muy mal Optimizado esto Pase de +500 lineas de Codigo a 265
import javax.swing.*;

public enum EnumSwitch {
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO;
    String Hora;
    String Mensaje;
 public String selector_Hora(){
     switch(this) {
         case LUNES:
             String ZonaHoraria;
             int zonaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria = (zonaHoraria == 1) ? "AM" : "PM";
             switch (ZonaHoraria) {
                 case "AM":
                     int hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                             Por Favor Ingrese LA Hora:                        
                             8, 9, 10, 11, 12.
                             """));
                     switch (hora) {

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }
                     return Mensaje="Horario Definido Para el Lunes: "+Hora;

                 case "PM":
                     hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                             Por Favor Digete La Hora:
                                                        
                             1, 2, 3, 4, 5, 6, 7.
                                                        
                             """));
                     switch (hora) {

                         case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }
                     return Mensaje="Horario Definido Para el Lunes: "+Hora;
             }
         case MARTES:
             zonaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria = (zonaHoraria == 1) ? "AM" : "PM";
             switch (ZonaHoraria) {
                 case "AM":
                     int hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                             Por Favor Ingrese LA Hora:
                                                      
                             8, 9, 10, 11, 12.
                                                     
                             """));
                     switch (hora) {

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Martes: "+Hora;

                 case "PM":
                     hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                             Por Favor Digete La Hora:
                             1, 2, 3, 4, 5, 6, 7.
                             """));
                     switch (hora) {

                         case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Martes: "+Hora;

             }
         case MIERCOLES:
             zonaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria = (zonaHoraria == 1) ? "AM" : "PM";
             switch (ZonaHoraria) {
                 case "AM":
                     int hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                             Por Favor Ingrese LA Hora:
                                                      
                             8, 9, 10, 11, 12.
                                                     
                             """));
                     switch (hora) {

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Miercoles: "+Hora;

         case "PM":
              hora = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Digete La Hora:
                     1, 2, 3, 4, 5, 6, 7.
                     """));
             switch (hora) {

                 case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                 default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
             }

             return Mensaje="Horario Definido Para el Miercoles: "+Hora;

     }
         case JUEVES:
             zonaHoraria=Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria=(zonaHoraria==1)?"AM":"PM";
             switch (ZonaHoraria){
                 case "AM":
                     int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"""
                         Por Favor Ingrese LA Hora:
                         
                         8, 9, 10, 11, 12.
                        
                         """));
                     switch(hora){

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Jueves:"+Hora;

                 case "PM":
                     hora=Integer.parseInt(JOptionPane.showInputDialog(null, """
                           Por Favor Digete La Hora:
                           1, 2, 3, 4, 5, 6, 7.
                           """));
                     switch(hora){

                         case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Jueves:"+Hora;

             }
         case VIERNES:
             zonaHoraria=Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria=(zonaHoraria==1)?"AM":"PM";
             switch (ZonaHoraria){
                 case "AM":
                     int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"""
                         Por Favor Ingrese LA Hora:
                         
                         8, 9, 10, 11, 12.
                        
                         """));
                     switch(hora){

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");

                     }

                     return Mensaje="Horario Definido Para el Viernes: "+Hora;

                 case "PM":
                     hora=Integer.parseInt(JOptionPane.showInputDialog(null, """
                           Por Favor Digete La Hora:
                           1, 2, 3, 4, 5, 6, 7.
                           """));
                     switch(hora){

                         case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Viernes: "+Hora;

             }
         case SABADO:
             zonaHoraria=Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Por Favor Eliga La Zona Horaria
                     1. AM
                     2. PM
                     """));
             ZonaHoraria=(zonaHoraria==1)?"AM":"PM";
             switch (ZonaHoraria){
                 case "AM":
                     int hora=Integer.parseInt(JOptionPane.showInputDialog(null,"""
                         Por Favor Ingrese LA Hora:
                         
                         8, 9, 10, 11, 12.
                        
                         """));
                     switch(hora){

                         case 8,9,10,11,12->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Sabado: "+Hora;
                 case "PM":
                     hora=Integer.parseInt(JOptionPane.showInputDialog(null, """
                           Por Favor Digete La Hora:
                           1, 2, 3, 4, 5, 6, 7.
                           """));
                     switch(hora){

                         case 1,2,3,4,5,6,7->Hora=hora+":00 "+ZonaHoraria;

                         default -> JOptionPane.showMessageDialog(null, "Valor No Reconocido");
                     }

                     return Mensaje="Horario Definido Para el Sabado: "+Hora;

             }
     }
 return Mensaje;
 }

    public static void main(String[] args) {
    int input=Integer.parseInt(JOptionPane.showInputDialog(null, """
             Por Favor Elija el Dia de la Semana en la que Desea Usar el Material o la Zona.
             1. Lunes.
             2. Martes.
             3. Miercoles.
             4. Jueves.
             5. Viernes. 
             6. Sabado.
             """));

    String Input=(input==1)?"LUNES":(input==2)?"MARTES":(input==3)?"MIERCOLES":(input==4)?"JUEVES":(input==5)?"VIERNES":"SABADO";

    EnumSwitch dia=EnumSwitch.valueOf(Input);

        JOptionPane.showMessageDialog(null,dia.selector_Hora());

    }
}