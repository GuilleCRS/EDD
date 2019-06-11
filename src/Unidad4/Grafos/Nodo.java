/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4.Grafos;

/**
 *
 * @author ADM
 */
class Nodo<T>
{
   public T Info;
   private Nodo<T>   Sig;
   public Nodo(T d)
   {  Info=d;
      Sig=null;
   }
   public Nodo<T> DameSig(){
      return Sig;
   }
   public void setSig(Nodo<T> Ap){
	 Sig=Ap;
   }
}
