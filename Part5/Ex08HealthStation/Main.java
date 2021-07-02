package Part5.Ex08HealthStation;

public class Main {
    public static void main (String[] args){
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weight(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weight(peter) + " kilos");
        
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);

        System.out.println("");

        childrensHospital.weight(ethan);
        childrensHospital.weight(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weight(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weight(peter) + " kilos");
        
        childrensHospital.weight(ethan);
        childrensHospital.weight(peter);
        

        System.out.println("weighings performed: " + childrensHospital.weighings());

    }
}
