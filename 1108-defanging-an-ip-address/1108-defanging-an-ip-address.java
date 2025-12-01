class Solution {
    public String defangIPaddr(String address) {
        String str=address.replaceAll("\\.","[.]");
        return str;
    }
}