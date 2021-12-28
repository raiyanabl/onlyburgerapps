package com.example.proyekakhir;

import java.util.ArrayList;

public class BurgerData {
    private static String [] burgerName = {
            "Beef Burger",
            "Chicken Burger",
            "Fish Burger",
            "Signature Burger",
            "Cheese Burger",
            "Egg Burger",
            "Barbeque Burger",
            "Bulgogi Burger"
    };

    private static String [] burgerDetail = {
            "$2.0 Burger dengan 100% daging sapi Australia dengan selada segar, tomat, acar timun, potongan bawang bombai dan mustard.",
            "$2.5 Setangkup English muffin hangat dilapis saus mayonais dengan daging ayam olahan yang digoreng dengan sempurna. Tersedia dari jam 5-11 pagi.",
            "$2.1 Daging ikan pilihan, dengan saus tartar dan keju istimewa dalam setangkup roti lembut kukus.",
            "$3.0 Burger Big Mac dengan extra tambahan 1 lembar Beef Rasher, yaitu lembaran daging yang dimasak secara grill.",
            "$2.1 Perpaduan roti burger dengan daging sapi gurih, selada segar, keju, saus tomat, acar, potongan bawang dan mustard.",
            "$3.2 English muffin hangat yang disajikan dengan daging ayam asap, telur, dan keju bernutrisi. Tersedia dari jam 5-11 pagi.",
            "$2.8 Perpaduan klasik barbeque, sosis ayam , telur, dan selembar keju bernutrisi. Tersedia dari jam 5-11 pagi.",
            "$1.9 Perpaduan rasa khas bulgogi, daging sapi , telur, dan selembar keju dan selada bernutrisi. Tersedia dari jam 5-11 pagi"
    };

    private static int[] burgerImage ={
            R.drawable.beef,
            R.drawable.chicken,
            R.drawable.fish,
            R.drawable.signature,
            R.drawable.cheese,
            R.drawable.egg,
            R.drawable.baa,
            R.drawable.bulg
    };

    static ArrayList<Burger> getListData(){
        ArrayList<Burger> list = new ArrayList<>();
        for (int position = 0; position<burgerName.length; position++) {
             Burger burger = new Burger();
             burger.setName(burgerName[position]);
             burger.setDetail(burgerDetail[position]);
             burger.setPhoto(burgerImage[position]);
             list.add(burger);
        }
        return list;
    }
}
