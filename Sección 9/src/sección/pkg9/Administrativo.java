package sección.pkg9;
public class Administrativo extends Empleado {
        private double Horas;
        public Administrativo(){
            super();
        }
        public double getHoras() {
            return Horas;
        }
        public void setHoras(double Horas){
            this.Horas = Horas;
        }
        public void calcularSueldo(){
            if (Horas <= 160) {
                Sueldo = Horas * 20;
            }
            else {
                Sueldo = 3200 + (Horas - 160) * 40;
            }
        }
}

