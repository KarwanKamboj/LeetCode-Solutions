class Solution {
    private int convert(String date) {
        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        String[] parts = date.split("-");
        int m = Integer.parseInt(parts[0]);
        int d = Integer.parseInt(parts[1]);

        for (int i = 0; i < m - 1; i++) {
            d += days[i];
        }

        return d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(
            convert(arriveAlice),
            convert(arriveBob)
        );

        int end = Math.min(
            convert(leaveAlice),
            convert(leaveBob)
        );

        return Math.max(0, end - start + 1);
    }
}