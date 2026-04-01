class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        map<int, int> dict;

        for(auto i : nums){
            if(dict.find(i) != dict.end()) {
                return true;
            }

            dict[i] = i;
        }

        return false;
    }
};