public class DogProblem {
    public static Dog[] largerThanFour(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt=0;
        for (int i=0;i<dogs.length;i++){
            if(isBiggestOfFour(dogs,i)){
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }
        returnDogs = arrayWithoutNulls(returnDogs, cnt);
        return returnDogs;
    }

    public static Dog[] arrayWithoutNulls(Dog[] dogs, int cnt) {
        Dog[] noNullDogs = new Dog[cnt];
        for (int i = 0; i < cnt; i++) {
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i){
        boolean isBiggest = true;
        for(int j=-2; j<=2; j++){
            int compareIndex = i+j;

            /*avoid compare with self*/
            if (j==0){
                continue;
            }

            if (validIndex(dogs, compareIndex)){
                if (dogs[compareIndex].weight >= dogs[i].weight){
                    isBiggest= false;
                }
            }
        }return isBiggest;
    }

    public static boolean validIndex(Dog[] dogs, int i){
        if (i<0 || i>= dogs.length){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20)
        };
        Dog[] bigDogs = largerThanFour(dogs);
        for (int k =0; k<bigDogs.length;k+=1){
            System.out.println(bigDogs[k].weight+" ");
        }
        System.out.println();
    }
}
