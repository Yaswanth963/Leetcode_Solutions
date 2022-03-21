class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        List<List<Integer>> al = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] == min)
                al.add(List.of(arr[i-1],arr[i]));
        }
        return al;
    }
}