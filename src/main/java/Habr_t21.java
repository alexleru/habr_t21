public class Habr_t21 {
    public static void main(String[] args) {
        RandomWithWeight randomWithWeight =
                new RandomWithWeight(new int[]{1, 2, 3}, new int[]{1, 2, 10});
        for (int i = 0; i < 50; i++) {
            System.out.println(randomWithWeight.randomWithWeight());
        }

    }
}
