class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String t;
        int t1;
        for(int i = 0 ; i < heights.length ; i++)
        {
            for(int j = 0 ; j < heights.length-i-1 ; j++)
            {
                if(heights[j]<heights[j+1])
                {
                    t1=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=t1;
                    t = names[j];
                    names[j]=names[j+1];
                    names[j+1]=t;

                }
            }
        }
        return names;
    }
}