public class Main {

    public static void main(String[] args) {
        int[] s = {2,3,4,5,6,7,8,9,11};

        System.out.println(findmissing(s));
    }

    public static int findmissing(int[] arr){
        int middle = arr.length/2;
        boolean doing = true;
        if(arr.length < 2 || arr[arr.length-1] == arr.length-1 + arr[0]) return 0;
        while(doing){
            int res = check(arr[middle-1], arr[middle], arr[middle+1]);
            if(res != -1 ) return res;
            int t = middle + arr[0];
            if(t == arr[middle]){middle = arr.length - middle/2;}
            else middle = middle/2;
        }
        return 0;
    }

    public static int check(int a1, int a2, int a3){
        if (a2-a1 != 1) return a2-1;
        if (a3-a2 != 1) return a3-1;
        return -1;
    }
}
