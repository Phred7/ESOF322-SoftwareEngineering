/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexample;

/**
 *
 * @author k57h721
 */
public class All  implements CheckStrategy {
    @Override
    public boolean check(String s) {
        return true;
    }
    
}
