public class RandomWithWeight {
    private int[] value;
    private int[] weight;
    public RandomWithWeight(int[] value, int[] weight){
        this.value = value;
        this.weight = weight;
    }

    public int randomWithWeight(){
        int size = value.length;
        int choice = (int)(Math.random()*size);
        return value[choice];
    }
}
