package Part5.Ex06OverloadedCounter;

public class Counter {
    private int startValue;
 
    
    public int value() {
        return startValue;
    }

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this.startValue = 0;
    }

    public void increase(){
        this.startValue = this.startValue + 1;
    }

    public void increase(int increaseBy){
        if(increaseBy >= 0) {
        this.startValue = this.startValue + increaseBy;
        }
    }

    public void decrease(){
        this.startValue = this.startValue - 1;
    }

    public void decrease(int decreaseBy){
        if(decreaseBy >= 0) {
            this.startValue = this.startValue + decreaseBy;
            }
    }
}
