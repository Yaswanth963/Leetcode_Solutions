class UndergroundSystem {

   Map<Integer,Pair>map1; 
    Map<String,List<Double>> map2;
    public UndergroundSystem() {
        map1= new HashMap<>();
        map2=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map1.put(id,new Pair(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        String s=map1.get(id).name;
        List<Double> l = new ArrayList<>();
        if(!map2.containsKey(s+"|"+stationName)){
            l.add((double)(t-map1.get(id).val));
            map2.put(s+"|"+stationName,l);
        }
        else{
            map2.get(s+"|"+stationName).add((double)(t-map1.get(id).val));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List<Double> po= map2.get(startStation+"|"+endStation);
        double sum=0;
        for(Double d:po)
            sum+=d;
        return sum/po.size();
    }
}

class Pair{
    String name;
    int val;
    Pair(String name,int val){
        this.name=name;
        this.val=val;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */