Best video solution: https://youtu.be/gAF9lAd9VVc
problem link - https://www.geeksforgeeks.org/problems/difference-check/1

class Solution {
    public int minDifference(String[] arr) {
        // code here
         boolean[] bucket = new boolean[86400]; // Each second of the day 24*3600
        List<Integer> times = new ArrayList<>();

        //  1: Convert each time to seconds and fill the bucket
        for (String time : arr) {
            int sec = toSeconds(time);
            if (bucket[sec]) return 0; // Duplicate time → diff is 0
            bucket[sec] = true;
        }

        // 2: Collect sorted times from bucket
        for (int i = 0; i < 86400; i++) {
            if (bucket[i]) times.add(i);
        }

        // 3 minimum difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < times.size(); i++) {
            minDiff = Math.min(minDiff, times.get(i) - times.get(i - 1));
        }

        //   edge case time is circualr
        // eg arr = [ "00:00:01", "23:59:59"]
        int last = times.get(times.size() - 1);
        int first = times.get(0);
        minDiff = Math.min(minDiff, 86400 - last + first);

        return minDiff;
    }
     int toSeconds(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
}

