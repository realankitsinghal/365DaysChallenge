HashMap<Integer, Integer> sumCount = new HashMap<>();
        int count = 0;
        int sum = 0;

        for (int num : nums) {
        sum += num;
        if (sum == goal) {
        count++;
        }
        int complement = sum - goal;
        count += sumCount.getOrDefault(complement, 0);
        sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }

        return count;