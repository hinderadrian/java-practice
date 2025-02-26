package leetcodechallenges;

public class _605_CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = new int[]{0,1,0};
        int n = 1;

        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int validTimes = 0;

        if(flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (validTimes == n) return true;

            if (i == 0) {
                if (flowerbed[i] == 1) {
                    continue;
                }
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    validTimes++;
                    continue;
                } else {
                    continue;
                }
            }

            if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 1) {
                    continue;
                }
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    validTimes++;
                    continue;
                } else {
                    continue;
                }
            }

            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                validTimes++;
            }

        }
        return validTimes == n;
    }
}
