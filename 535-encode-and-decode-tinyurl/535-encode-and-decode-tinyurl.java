public class Codec {

    // Encodes a URL to a shortened URL.
    Map<String,String> map = new HashMap<>();
    public String encode(String longUrl) {
        String temp[]=longUrl.split("/");
        String hash = temp[temp.length-1];
        // System.out.println(hash);
        map.put(hash,longUrl);
        return longUrl.replace(hash,"")+hash;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String temp[] = shortUrl.split("/");
        // System.out.println(temp[temp.length-1]);
        return map.get(temp[temp.length-1]);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));