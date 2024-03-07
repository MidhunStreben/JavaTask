 class Digits {
    public static void main(String[] args) {
        int firstNumber = 0;
        int lastNumber = 1000;
        int sum=0;

        for (int i = firstNumber + 1; i < lastNumber; i++) {
            
            
            sum+=i;
            
        }
        System.out.println("the sum of the numbers in between "+firstNumber+" and "+lastNumber+" is "+sum);
        
    }

    
    }

