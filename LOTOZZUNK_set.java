package lotozzunk_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LOTOZZUNK_set {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set s=new HashSet();
        while(s.size()<5){
            int random=(int) (Math.random()*91);
            s.add(random);
        }
        Set szamok=new HashSet();
        System.out.println("Kérlek írj be 5 számot 1-90 között: ");
        int szam=sc.nextInt();
        
        while(szamok.size()!=4){
            if(szam>0 && szam<=90){
                szamok.add(szam);
                szam=sc.nextInt();
            }
            else{
                System.out.println("1-90 közötti számot adj meg!");
                szam=sc.nextInt();
            }
           
        }
        int talalat=0;
        Iterator i = s.iterator();
       
        while(i.hasNext()){
            Iterator i2 = szamok.iterator();
            int a = (int)i.next();
            while(i2.hasNext()){
                  int b= (int) i2.next();
                      if(a==b){
                           talalat++;
                      }
            } 
        }
        
        if(talalat!=0){
            System.out.println("Gartulálok " +talalat+"db találatod van!");
        }
        else{
            System.out.println("Sajnos nem nyertél!");
        }
      
    }
    
}
