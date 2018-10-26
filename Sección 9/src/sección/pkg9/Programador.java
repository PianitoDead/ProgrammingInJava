package sección.pkg9;
public class Programador extends Empleado {
        private int Nivel;
        public Programador (){
            super();
        }
        public int getNivel (){
            return Nivel;
        }
        public void setNivel (int Nivel) {
         this.Nivel = Nivel;   
        }       
        public void calcularSueldo(){
            switch(Nivel){
                case 1:
                    Sueldo = 2000;break;
                case 2:
                    Sueldo = 3000;break;
                case 3:
                    Sueldo = 5000;break;
                        }
                                    }
}