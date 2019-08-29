public class RandomWithWeight {
    private int[] value;
    private int[] weight;
    public RandomWithWeight(int[] value, int[] weight){
        if (value.length == weight.length) {
            this.value = value;
            this.weight = weight;
        } else {
            Exception exception = new Exception("problem");
        }
    }

    public int randomWithWeight(){
        int choice = (int) Math.round(Math.random()*sum());
        return value[selectTheInterval(choice)];
    }

    private int sum(){
        int sum = 0;
        for (int item: weight) {
            sum += item;
        }
        System.out.println("SUM = " + sum);
        return sum;
    }

    private int selectTheInterval(int random){
        int sum = 0;
        for (int i = 0; i < weight.length ; i++) {
            sum += weight[i];
            if(sum >= random) {
                System.out.println("ran = " + random + " sum = " + sum + " i = " + (i+1));
                return i;
            }
        }
        return 0;
    }
}
