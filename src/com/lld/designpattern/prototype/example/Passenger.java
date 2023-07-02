package com.lld.designpattern.prototype.example;

public class Passenger {

    public static void main(String[] args) {

        Train sampurnaKranti = new Train();
        sampurnaKranti.setName("Sampoorna Kranti Express");
        sampurnaKranti.setTrainNO(12393);
        sampurnaKranti.setFare(1500);
        sampurnaKranti.setTrainType("Super fast Exp/ AC chair");
        sampurnaKranti.setEngineType("Electrical Engine");
        sampurnaKranti.setNoOfSeats(72);

        Train gareebRath = new Train();
        gareebRath.setName("Gareeb Rath Express");
        gareebRath.setTrainNO(22405);
        gareebRath.setFare(1200);
        gareebRath.setTrainType("Super fast Exp");
        gareebRath.setEngineType("Electrical Engine/ Petrol Engine");
        gareebRath.setNoOfSeats(72);

        Train seemanchalExp = new Train();
        seemanchalExp.setName("Seemanchal Express");
        seemanchalExp.setTrainNO(12487);
        seemanchalExp.setFare(1400);
        seemanchalExp.setTrainType("Super fast Exp");
        seemanchalExp.setEngineType("Electrical Engine/ Coal Engine");
        seemanchalExp.setNoOfSeats(72);

        TrainRegistry registry = new TrainRegistry();
        registry.save(sampurnaKranti);
        registry.save(gareebRath);
        registry.save(seemanchalExp);

        /**/

        Train sampoornaPrototype = registry.get("Sampoorna Kranti Express");
        Train rajendraNagar1 = sampoornaPrototype.clone();
        rajendraNagar1.setTime("1925 HRS");
        rajendraNagar1.setStationName("Rajendra Nagar Terminal");

        Train gareebRathPrototype = registry.get("Gareeb Rath Express");
        Train rajendraNagar2 = gareebRathPrototype.clone();
        rajendraNagar2.setTime("1755 HRS");
        rajendraNagar2.setStationName("Rajendra Nagar Terminal");

        Train seemanchalPrototype = registry.get("Seemanchal Express");
        Train rajendraNagar3 = seemanchalPrototype.clone();
        rajendraNagar3.setTime("0520 HRS");
        rajendraNagar3.setStationName("Patliputra Junction");

        System.out.println(rajendraNagar1);
        System.out.println(rajendraNagar2);
        System.out.println(rajendraNagar3);

        Train patnaJunction1 = sampoornaPrototype.clone();
        patnaJunction1.setTime("1945 HRS");
        patnaJunction1.setStationName("Patna Junction");

        Train patnaJunction2 = gareebRathPrototype.clone();
        patnaJunction2.setTime("1815 HRS");
        patnaJunction2.setStationName("Patna Junction");

        Train patnaJunction3 = seemanchalPrototype.clone();
        patnaJunction3.setTime("0535 HRS");
        patnaJunction3.setStationName("Danapur Junction");

        System.out.println(patnaJunction1);
        System.out.println(patnaJunction2);
        System.out.println(patnaJunction3);

        Train delhi1 = sampoornaPrototype.clone();
        delhi1.setTime("0630 HRS");
        delhi1.setStationName("New Delhi");

        Train delhi2 = gareebRath.clone();
        delhi2.setTime("0850");
        delhi2.setStationName("Anand Vihar Terminal");

        Train delhi3 = seemanchalExp.clone();
        delhi3.setTime("2045 HRS");
        delhi3.setStationName("Anand Vihar Terminal");

        System.out.println(delhi1);
        System.out.println(delhi2);
        System.out.println(delhi3);
    }
}
