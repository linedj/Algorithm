class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = wallpaper[0].length();
        int luy = wallpaper.length;
        int rdx = 0;
        int rdy = 0;

        for(int y=0; y<wallpaper.length;y++){
            for(int x=0; x<wallpaper[0].length();x++){
                if(wallpaper[y].charAt(x)=='#'){
                    if(lux>x){
                        lux=x;
                    }
                    if(luy>y){
                        luy=y;
                    }
                    if(rdx<x){
                        rdx=x;
                    }
                    if(rdy<y){
                        rdy=y;
                    }
                }
            }
        }

        return new int[]{luy, lux, rdy + 1, rdx + 1};
    }
}