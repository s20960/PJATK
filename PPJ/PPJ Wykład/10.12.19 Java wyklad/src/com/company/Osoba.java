package com.company;

public class Osoba {

    public void zjedz(Owoc owoc){
        try {
            owoc.uwolnijSmak();
        }catch (ZepsutyOwocException e) {
            System.out.println("wypluj");
        }catch(NiedojrzalyOwocException e1){
            System.out.println("polknij");
        }catch(Exception ex){
            System.out.println("nie wiem co robic");
        }

    }
}
