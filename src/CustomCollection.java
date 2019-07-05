import java.util.ArrayList;
import java.util.Arrays;
 class CustomCollection extends ArrayList{

    protected CustomCollection(Object...objects){
        addAll(Arrays.asList(objects));
    }

    protected int start(Object myObj){
        int myHash = myObj.hashCode();
        add(myObj);
        int count = 1;

        while (myHash!=get(0).hashCode()){
            moveToEnd(get(0));
            count++;
        }
        return count;
    }

    private void moveToEnd(Object o){
        Object temp = o;
        remove(o);
        add(temp);
    }



 }

