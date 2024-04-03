public class Relogio {
    
    private int horas; 
    private int minutos;

    public int getHoras() {
        return horas;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public void setHoras(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }


    
    public void incrementarMinutos(){

       this.minutos += 1;
       if(this.minutos == 60){

        this.minutos = 00;
        this.horas += 1;

       }
   
    }
   

    public void mostrarHora(){

        if(this.horas > 23 || this.minutos > 59) System.out.println("Hora Invalida");
        else if(this.minutos < 10) System.out.println(this.getHoras() + ":0" + this.getMinutos());
        else System.out.println(this.getHoras() + ":" + this.getMinutos());

   
    }
   


}
