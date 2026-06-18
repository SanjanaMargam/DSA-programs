class Solution {
    public boolean isValidSudoku(char[][] a) {

        int m=a.length;
        int n=a[0].length;

        for(int i=0;i<m;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<n;j++){

               if(a[i][j]!='.'){     
                int num=a[i][j]-'0';
                if(s.contains(num)) return false;
                s.add(num);
               }

            }
        }

        for(int j=0;j<n;j++){
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<m;i++){

                if(a[i][j]!='.'){     
                 int num=a[i][j]-'0';
                if(s.contains(num)) return false;
                s.add(num);
               }

            
            }
        }

       for(int row = 0; row < 9; row += 3) {
    for(int col = 0; col < 9; col += 3) {

        Set<Integer> s = new HashSet<>();

        for(int i = row; i < row + 3; i++) {
            for(int j = col; j < col + 3; j++) {

                if(a[i][j] != '.') {
                    int num = a[i][j] - '0';

                    if(s.contains(num))
                        return false;

                    s.add(num);
                }
            }
        }
    }
}

return true;
    }
}
