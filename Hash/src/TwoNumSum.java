import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoNumSum {

    //方法一：暴力求解
    public int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target) {
                        return new int []{i,j};
                    }
                }
            }
            return new int [2];
        }
    }

    
