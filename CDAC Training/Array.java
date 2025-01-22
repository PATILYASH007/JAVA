public class Array{
    public static void main(String[] args){
        int[][] arr= {{1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25}};
        //for Output 1
        int colpoint= 0;
        while(colpoint<5){
        int a= arr[1].length-1;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(a>=0){
                        System.out.print(arr[i][colpoint] + " ");
                        a=a-1;
                        break;
                    }
                }
            }
            colpoint=colpoint+1;
        }
        System.out.println();

        //for Output 2
        boolean state= true;
        for(int i=0; i<arr.length; i++){
            if(state==true){
                for(int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                state= false;
            }
            else{
                for(int j = arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
                state= true;
            }
        }

        System.out.println();
        //for Output 3
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
            if(i==j){
                System.out.print(arr[i][j] + " ");
            }
            }
        }
        int c= arr[1].length-1;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(c>=0){
                        System.out.print(arr[i][c] + " ");
                        c=c-1;
                        break;
                    }
                }
            }
        
    }
}