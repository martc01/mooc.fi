package Part5.Ex08HealthStation;

public class HealthStation {    
    private int count;

    public HealthStation(){
        count = 0;
    }

    public int weight(Person person) {
        count++;
        return person.getWeight();
    }   

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return count;
    }
}
