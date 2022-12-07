package pwo.lab13.app;

import java.util.List;
import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {
    
    /*
    Wyszukuje w tablicy stringów pozycję, która może być zinterpretowana 
    jako wartość typu ProcessData.Action. Wielkość czcionki nie ma znaczenia.
    Obowiazuje pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca wartość
    UNDEFINE.
    */
    
    public static Action getAction(String[] args) {
        for (String str : args) {
            try {
                Action actionType = Action.valueOf(str.toUpperCase());
            } catch(Exception ex) {
                
            }
        }
        return Action.UNDEFINE;
    }
    
    /*
    Wyszukuje w tablicy stringów pozycje, które moga byc zinterpretowane 
    jako liczby. Tworzy z tych liczb tablicę. Jeżeli nie ma liczb to
    zwraca pusta tablicę.
    */
    
    public static double[] getNumbers(String[] args) {
        List<Double> results = new ArrayList<>();
        for (String arg : args) {
            try {
                results.add(Double.valueOf(arg));
            } catch (NumberFormatException e) {
            }

        }
        return results.stream().mapToDouble(Double::doubleValue).toArray();
    }
    
}