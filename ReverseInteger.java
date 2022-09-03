class Solution { 
public int reverse(int x) { 
if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) 
return 0; 
else 
{ 
int rev=0, rem; 
while(x!=0) 
{ 
rem = x%10; 
if((rev>Integer.MAX_VALUE/10) || (rev<Integer.MIN_VALUE/10)){ 
return 0; 
} 
rev = rev*10 + rem; 
x/=10; 
} 
return rev; 
} 
} 
} 
