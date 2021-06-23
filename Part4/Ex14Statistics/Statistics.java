package Part4.Ex14Statistics;

public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number){
        count = count + 1;
        sum = sum + number;
    }

    public int getCount() {
        return count;
        
    }
    
    public int sum(){
        return sum;
    }

    public double average(){
        return (double)sum / count;
    }
}
