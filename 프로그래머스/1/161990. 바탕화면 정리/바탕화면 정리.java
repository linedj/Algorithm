class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = wallpaper[0].length();
        int luy = wallpaper.length;
        int rdx = 0;
        int rdy = 0;

        for(int i=0; i<wallpaper.length;i++){
            for(int j=0; j<wallpaper[0].length();j++){
                int nowX = j;
                int nowY = i;
                if(wallpaper[i].charAt(j)=='#'){
                    if(lux>nowX){
                        lux=nowX;
                    }
                    if(luy>nowY){
                        luy=nowY;
                    }
                    if(rdx<nowX){
                        rdx=nowX;
                    }
                    if(rdy<nowY){
                        rdy=nowY;
                    }
                }
            }
        }

        return new int[]{luy, lux, rdy + 1, rdx + 1};
    }
}