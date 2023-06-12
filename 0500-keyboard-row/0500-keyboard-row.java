class Solution {
    public String[] findWords(String[] a) {
        ArrayList<String> l=new ArrayList<>();
        int n=a.length;
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3= "zxcvbnm";
         for(int i=0;i<n;i++){
             String e=a[i];
             String s=a[i].toLowerCase();
             for(int j=0;j<s.length();j++){
                  String r=s.charAt(j)+"";
                if(!s1.contains(r)){
                    break;
                }
                if(j==s.length()-1){
                    l.add(e);
                }
             }
               for(int j=0;j<s.length();j++){
                   String r=s.charAt(j)+"";
                    System.out.println(r);
                if(!s2.contains(r)){
                    break;
                }
                if(j==s.length()-1){
                    l.add(e);
                }
             }
            
               for(int j=0;j<s.length();j++){
                    String r=s.charAt(j)+"";
                if(!s3.contains(r)){
                    break;
                }
                if(j==s.length()-1){
                    l.add(e);
                }
             }
         }
         String h1[]=new String[l.size()];
        int y=0;
        for(String p:l){
            h1[y++]=p;
        }
        return h1;
    }
}