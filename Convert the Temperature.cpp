class Solution {
public:
    vector<double> convertTemperature(double c) {
        vector <double> v ;
        double k , f ;
        k = c + 273.15 ;
        v . push_back (k) ;
        f = c * 1.80 + 32.00 ;
        v . push_back (f) ;
        return v ;
    }
};