public class Junit {

    public int add2Nums(int a, int b) {
        return a + b;
    }

//    Example 1
    public int sumDouble(int a, int b) {
        if(a == b){
            return 2*(a+b);
        }
        return a+b;
    }

//    Example 2
    public boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;

    }

//    Example 3
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

//    Example 5
    public boolean love6(int a, int b){
        if(a == 6 || b ==6){
            return true;
        }else if(a+b == 6){
            return true;
        } else if(Math.abs(a-b)==6){
            return true;
        }else
            return false;
    }
}


