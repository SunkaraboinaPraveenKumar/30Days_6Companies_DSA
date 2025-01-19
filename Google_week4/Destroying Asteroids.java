import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(mass>100_000){
                return true;
            }
            if(mass>=asteroids[i]){
                mass+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}