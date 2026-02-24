public class MathDemo{
    public int min(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}