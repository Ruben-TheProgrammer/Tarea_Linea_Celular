package linea_celular;

/**
 *
 * @author Ruben
 */

public class Linea {
    
        private String titular;
        private long numero;
        private int costoM;
        private int saldo;
        private int minutosfree;
        private int gastollamada;
        
    
        public Linea(String pTitular, long pNumero, int pcostoM, int pSaldo, int pMinutosFree, int gastoll){
            titular = pTitular;
            numero = pNumero;
            costoM = pcostoM;
            saldo = pSaldo;
            minutosfree = pMinutosFree;
            gastollamada = gastoll;
        }
        
        public Linea(){
        }
      
        public String getTitular(){
        return titular; 
        }
        
        public long getNumero(){
        return numero; 
        }
        
        public long getCosto(){
        return costoM; 
        }
        
        public long getSaldo(){
            return saldo;
        }
        
        public int  getMinutos(){
        return minutosfree;
        }
        public String getCambioN(){
        return titular;
        }
        
        
        
        public void setTitular(String pTitular){
        titular=pTitular; 
        }
        
        public void setNumero(long pNumero){
        numero = pNumero;
        }
        
        public void setCost(int pcostoM){
        costoM = pcostoM;
        }
       
        public void setSaldot(int pSaldo){
        saldo = pSaldo;
        }
        
        public void setFree(int pFree){
        minutosfree = pFree;
        }
        
        
        public void recargar(int monto){
         if (minutosfree >=0){
            saldo = saldo + monto;
         }else{
              minutosfree = minutosfree + monto;
         }
        }
        
        public void minutosfree(int free){
            minutosfree = minutosfree + free;
        }
        
        public void llamar(int minuts){
           int hablados = minuts * costoM;
          
          if (saldo >= 0){
            saldo = saldo - hablados;
        }else{
            minutosfree = minutosfree - hablados;
                }
        }
        
        public void nuevoNombre(String nuevoN){
            titular = nuevoN;
        }
}
