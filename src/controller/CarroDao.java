/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Carro;
/**
 * 
 * @author Jaime Rungo
 */

public class CarroDao {
    File directorio=new File("C:\\Gestao");
    File bancoDados=new File("C:\\Gestao\\Carro.dat");
    
    public void CaminhoPrincipal(){
      
      
        
        if(directorio.exists()){
           System.out.print("Direcorio OK!");
        }else{
            directorio.mkdir();
        }
        
        if(bancoDados.exists()){
           System.out.print("Banco de dados OK!");
           
        }else{
            try {
                bancoDados.createNewFile();
                
                ArrayList<Carro> lista=new ArrayList();
              
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
             

              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(CarroDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public int gerarID(){
      ArrayList<Carro> lista=new ArrayList();
        
         lista= (ArrayList<Carro>)lista().clone();
         
         return lista.get(lista.size()).getCodigo()+1;
    }
    
    public static void create(Carro p){
        ArrayList<Carro> lista=new ArrayList();
        
         lista= (ArrayList<Carro>)lista().clone();
         lista.add(p);
        
          try {
              File bancoDados=new File("C:\\Gestao\\Carro.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    public static void delete(int id){
        ArrayList<Carro> lista=new ArrayList();
        
         lista= (ArrayList<Carro>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getCodigo()==id){
                lista.remove(i);
            }
        }
        
          try {
              File bancoDados=new File("C:\\Gestao\\Carro.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public static void edit(int id,Carro p){
        ArrayList<Carro> lista=new ArrayList();
        
         lista= (ArrayList<Carro>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getCodigo()==id){
                lista.remove(i);
                lista.add(p);
            }
        }
        
          try {
              File bancoDados=new File("C:\\Gestao\\Carro.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
     public static  ArrayList<Carro> search(String nome){
        ArrayList<Carro> lista=new ArrayList();
         ArrayList<Carro> nova=new ArrayList();
         
         lista= (ArrayList<Carro>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getMarca().startsWith(nome)){
                
                nova.add(lista.get(i));
            }
        }
          return nova;
    }
     
     
     /**
      * 
      * @param filtro
      * @return nova
      */
     //Metodo para filtrar por meses e por cor
     public static  ArrayList<Carro> filtrar(String data){
        ArrayList<Carro> lista=new ArrayList();
         ArrayList<Carro> nova=new ArrayList();
         lista= (ArrayList<Carro>)lista().clone();
         String vermelho = "Vermelho";
         String amarelo = "Amarelo";
         String verde = "Verde";
         String azul = "Azul";
         
         String teste="10/12/2001";
         String mes2= teste.substring(3,5);
         //10/09/2001
       for (int i = 0; i < lista.size(); i++) {
            String mes1= lista.get(i).getData().substring(3,5);
            
            System.out.println("mese 1 "+mes1);
            System.out.println("mese 2 "+mes2);
            int meses = Integer.parseInt(mes2)-Integer.parseInt(mes1);
            System.out.println("meses t "+meses);
            if(meses>2){
                if(lista.get(i).getCor().equalsIgnoreCase(vermelho)){
                    nova.add(lista.get(i));
                    System.out.println("sim sim ");
                    break;
                }
                else if(lista.get(i).getCor().equalsIgnoreCase(verde)){
                    nova.add(lista.get(i));
                    System.out.println("sim sim ");
                    break;
                }
                
                else if(lista.get(i).getCor().equalsIgnoreCase(amarelo)){
                    nova.add(lista.get(i));
                    System.out.println("sim sim ");
                    break;
                }
                
                else if(lista.get(i).getCor().equalsIgnoreCase(azul)){
                    nova.add(lista.get(i));
                    System.out.println("sim sim ");
                    break;
                }
            }
            else{
                System.out.println("nao nao nao");
            }
        }
          return nova;
    }
     
      
    
    public static ArrayList<Carro> lista(){
        ArrayList<Carro> lista=new ArrayList();
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\Gestao\\Carro.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              lista=(ArrayList<Carro>)os.readObject();
                   
             os.close();
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          return lista;
        
    }
    
    public static void  listas(){
        
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\Gestao\\Carro.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              ArrayList<Carro> lista=(ArrayList<Carro>)os.readObject();
              
              os.close();
                  
              
            
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
    }
}
