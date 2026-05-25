// Last updated: 5/25/2026, 11:14:47 AM
import java.util.*;

class Solution {
    class Cell {
        int h,r,c;
        Cell(int h,int r,int c){this.h=h;this.r=r;this.c=c;}
    }

    public int trapRainWater(int[][] h) {
        int m=h.length,n=h[0].length;
        if(m<3||n<3)return 0;
        boolean[][] v=new boolean[m][n];
        PriorityQueue<Cell> pq=new PriorityQueue<>((a,b)->a.h-b.h);
        for(int i=0;i<m;i++){pq.add(new Cell(h[i][0],i,0));pq.add(new Cell(h[i][n-1],i,n-1));v[i][0]=v[i][n-1]=true;}
        for(int j=0;j<n;j++){pq.add(new Cell(h[0][j],0,j));pq.add(new Cell(h[m-1][j],m-1,j));v[0][j]=v[m-1][j]=true;}
        int ans=0,dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
            Cell cur=pq.poll();
            for(int[]d:dirs){
                int x=cur.r+d[0],y=cur.c+d[1];
                if(x<0||y<0||x>=m||y>=n||v[x][y])continue;
                ans+=Math.max(0,cur.h-h[x][y]);
                pq.add(new Cell(Math.max(cur.h,h[x][y]),x,y));
                v[x][y]=true;
            }
        }
        return ans;
    }
}
