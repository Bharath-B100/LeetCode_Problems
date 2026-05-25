// Last updated: 5/25/2026, 11:13:01 AM
// class Solution {
//     public String defangIPaddr(String address) 
//     {
//         String ans = "";
//         int index = 0;

//         while(index < address.length())
//         {
//             if(address.charAt(index) == '.')
//             {
//                 ans = ans + "[.]";
//             }
//             else 
//             ans = ans + address.charAt(index);
//             index++;
//         }
//         return ans;
//     }
// }
class Solution {
    public String defangIPaddr(String address) {
      String result=address.replace(".","[.]");
      return result;
    }
}
