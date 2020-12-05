package ru.zavrazhin;

public class ConteinerSolution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int a = 0;
        int b = height.length - 1;
        while (a < b) {
            int maxareanew = Math.min(height[a], height[b]) * (b - a);
            maxarea = Math.max(maxarea, maxareanew);
            if (height[a] < height[b]) {
                a++;
            } else {
                b--;
            }
        }
        return maxarea;
    }
}

