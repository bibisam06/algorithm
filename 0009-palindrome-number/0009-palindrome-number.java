class Solution {
    public boolean isPalindrome(int x) {

        boolean flag = false; 

        String value = String.valueOf(x);
        System.out.println(value);

        StringBuffer sb = new StringBuffer(value);
        String rv = sb.reverse().toString();

        if(rv.equals(value)) flag = true;

        return flag;
    }
}