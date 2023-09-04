class Solution {
    public String interpret(String command) {
        String s = "";
        for (int i = 0 ; i < command.length(); i++){
            if(command.charAt(i)=='G'){
                s += command.charAt(i);
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    s += 'o';
                }
                else{
                    s += 'a';
                    s += 'l';
                }
            }
        }
        return s;
    }
}