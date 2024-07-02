class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int n = cardPoints.size();
        int s = 0;

        // Calculate the sum of the first k cards
        for (int i = 0; i < k; i++) {
            s += cardPoints[i];
        }

        // This is our initial maximum sum
        int maxSum = s;

        // Use a sliding window to calculate the sum of other possible selections
        for (int i = 0; i < k; i++) {
            s -= cardPoints[k - 1 - i];
            s += cardPoints[n - 1 - i];
            maxSum = std::max(maxSum, s);
        }

        return maxSum;
    }
};
