package easy.placement.question;

public class Q1_GasStation {
     public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={4,5,2,1,3};

        // 1. first check that there is enough petrol to travel entire circle
         // like if total cost(ex.Kilometer) is greater than total gas(ex. petrol) then how it is going to travel
        int totalGas=0,totalCost=0;
        for(int i=0; i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas<totalCost){
           // return -1;
            System.out.println(-1);return;
        }

        // 2 Now to traverse if car have enough petrol
//       {1,2,3,4,5};
//       {3,4,5,1,2};

             int carMePetron=0, index=0;

         for(int i=0; i<gas.length; i++){
             carMePetron += gas[i];
             carMePetron = carMePetron - cost[i];

             if(carMePetron<0){
                carMePetron=0;
                index = i+1;
             }

         }
             System.out.println(index);


     }
}
