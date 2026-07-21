class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMaxVal = leftMax(height);
        int[] rightMaxVal = rightMax(height);
        int total = 0;

        for(int i=0; i<n; i++) {
            total += Math.min(leftMaxVal[i], rightMaxVal[i]) - height[i];
        }

        return total;
    }

    public int[] leftMax(int[] height) {
        int n = height.length;
        int[] leftMaxVal = new int[n];
        leftMaxVal[0] = height[0];

        for(int i=1; i<n; i++) {
            leftMaxVal[i] = Math.max(leftMaxVal[i-1], height[i]);
        }

        return leftMaxVal;

    }

    public int[] rightMax(int[] height) {
        int n = height.length;
        int[] rightMaxVal = new int[n];
        rightMaxVal[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--) {
            rightMaxVal[i] = Math.max(rightMaxVal[i+1], height[i]);
        }

        return rightMaxVal;
    }
}
