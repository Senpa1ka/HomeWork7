package homework7;

import geekbrains.Сотрудник;

public class Tarelka {
    protected String name;
    protected boolean ap;
    int tar = 20;
    public static void main(String[] args) {
        cat catBar = new cat("Barsik", false);
        catBar.eat(21);
    }
    public void eat(int appetit){
if (appetit>tar){
    System.out.println("недостаточно еды");
    ap = false;
}
else{
    int ost = tar-appetit;
    System.out.printf("кот поел");
    ap = true;
}
    }






    }

class cat extends Tarelka {

    public cat(String name, boolean ap) {
        this.name = name;
        this.ap = ap;
    }

}