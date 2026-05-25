// Last updated: 5/25/2026, 11:13:16 AM
class Solution {
    public int clumsy(int n) {
    //    Stack<Integer> st=new Stack<>();
    //    st.push(n);
    //    n--;
    //    int ind=0;
    //    while(n>0){
    //     if(ind%4==0){
    //         st.push(st.pop()*n);
    //     }
    //     else if(ind%4==1){
    //         st.push(st.pop()/n);
    //     }
    //     else if(ind%4==2){
    //         st.push(n);
    //     }
    //     else{
    //         st.push(-n);
    //     }
    //     n--;
    //     ind++;
    //    }
    //    int sum=0;
    //    for(int i:st){
    //     sum+=i;
    //    }
    //    return sum;
    if(n<=2) return n;
    if(n<=4) return n+3;
    if(n%4==0) return n+1;
    if(n%4<=2) return n+2;
    else return n-1;
    }
}