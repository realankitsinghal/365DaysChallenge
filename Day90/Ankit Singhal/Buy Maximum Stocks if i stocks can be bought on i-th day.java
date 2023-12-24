class Solution {
    static class Product implements Comparable<Product>{
        int price;
        int quan;
        
        public Product(int price,int quan){
            this.price=price;
            this.quan=quan;
        }
        
        @Override
        public int compareTo(Product p){
            return this.price-p.price;
        }
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        ArrayList<Product> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(new Product(price[i],i+1));
        }
        
        Collections.sort(ar);
        // for(Product i:ar){
        //     System.out.println(i.price);
        // }
        
        int ans=0;
        for(Product i:ar){
        int s=k/i.price;
        if(s>i.quan && k>i.price){
            ans+=Math.min(i.quan,s);
            k-=i.price*i.quan;
        }
        else{
            if(k>=i.price){
                ans+=Math.min(i.quan,s);
                k=k-i.price*s;
            }
          
        }
      
        

    }
        return ans;
}
        
}